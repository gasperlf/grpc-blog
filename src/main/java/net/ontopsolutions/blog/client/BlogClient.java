package net.ontopsolutions.blog.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import lombok.SneakyThrows;
import net.ontopsolutions.blog.Blog;
import net.ontopsolutions.blog.BlogCreateRequest;
import net.ontopsolutions.blog.BlogCreateResponse;
import net.ontopsolutions.blog.BlogListRequest;
import net.ontopsolutions.blog.BlogListResponse;
import net.ontopsolutions.blog.BlogReadRequest;
import net.ontopsolutions.blog.BlogReadResponse;
import net.ontopsolutions.blog.BlogServiceGrpc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BlogClient {

    public static void main(String[] args) {

        System.out.println("Hello I'm gRPC client for Blog");
        BlogClient client = new BlogClient();
        ManagedChannel channel = client.createSecurityChannel();

        client.run(channel);
        channel.shutdown();
    }

    private void run(ManagedChannel channel) {

        BlogServiceGrpc.BlogServiceBlockingStub stub = BlogServiceGrpc
                .newBlockingStub(channel);
        //createBlog(stub);
        readBlog(stub);
    }

    private void readBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {
        System.out.println("Calling server for read blog ");
        try {
            String blogId = "5f38595e3b0f1b5b7ccc8da1";
            BlogReadRequest request = BlogReadRequest.newBuilder().setBlogId(blogId).build();
            BlogReadResponse response = stub.readBlog(request);
            System.out.println("Received response from server ");
            System.out.println(response.toString());
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
    }

    private void createBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {

        BlogCreateResponse blogResponse = stub.createBlog(BlogCreateRequest.newBuilder()
                .setBlog(Blog.newBuilder().setAuthorId("Pinocho Jimenez")
                        .setContent("New document about traveles in Spain")
                        .setTitle("Travelers in Spain")
                        .build())
                .build());
        System.out.println("Received create blog response");
        System.out.println(blogResponse.toString());
    }

    private void listBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {

        List<BlogListResponse> listResponseList = new ArrayList<>();
        stub.listBlogs(BlogListRequest.newBuilder().build())
                .forEachRemaining(listResponseList::add);

        listResponseList.stream().forEach(blogListResponse ->
                System.out.printf(blogListResponse.getBlog().toString()));
    }

    @SneakyThrows
    private ManagedChannel createSecurityChannel() {
        return NettyChannelBuilder
                .forAddress("localhost", 50051)
                .sslContext(GrpcSslContexts
                        .forClient()
                        .trustManager(new File("ssl/ca.crt"))
                        .build())
                .build();
    }

    private ManagedChannel createChannel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
    }
}
