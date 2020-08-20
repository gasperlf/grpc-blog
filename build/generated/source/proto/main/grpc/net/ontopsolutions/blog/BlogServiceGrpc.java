package net.ontopsolutions.blog;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: blog/blog.proto")
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "blog.BlogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogCreateRequest,
      net.ontopsolutions.blog.BlogCreateResponse> getCreateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlog",
      requestType = net.ontopsolutions.blog.BlogCreateRequest.class,
      responseType = net.ontopsolutions.blog.BlogCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogCreateRequest,
      net.ontopsolutions.blog.BlogCreateResponse> getCreateBlogMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogCreateRequest, net.ontopsolutions.blog.BlogCreateResponse> getCreateBlogMethod;
    if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
          BlogServiceGrpc.getCreateBlogMethod = getCreateBlogMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.blog.BlogCreateRequest, net.ontopsolutions.blog.BlogCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("CreateBlog"))
              .build();
        }
      }
    }
    return getCreateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogReadRequest,
      net.ontopsolutions.blog.BlogReadResponse> getReadBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadBlog",
      requestType = net.ontopsolutions.blog.BlogReadRequest.class,
      responseType = net.ontopsolutions.blog.BlogReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogReadRequest,
      net.ontopsolutions.blog.BlogReadResponse> getReadBlogMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogReadRequest, net.ontopsolutions.blog.BlogReadResponse> getReadBlogMethod;
    if ((getReadBlogMethod = BlogServiceGrpc.getReadBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getReadBlogMethod = BlogServiceGrpc.getReadBlogMethod) == null) {
          BlogServiceGrpc.getReadBlogMethod = getReadBlogMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.blog.BlogReadRequest, net.ontopsolutions.blog.BlogReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ReadBlog"))
              .build();
        }
      }
    }
    return getReadBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogUpdateRequest,
      net.ontopsolutions.blog.BlogUpdateResponse> getUpdateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlog",
      requestType = net.ontopsolutions.blog.BlogUpdateRequest.class,
      responseType = net.ontopsolutions.blog.BlogUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogUpdateRequest,
      net.ontopsolutions.blog.BlogUpdateResponse> getUpdateBlogMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogUpdateRequest, net.ontopsolutions.blog.BlogUpdateResponse> getUpdateBlogMethod;
    if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
          BlogServiceGrpc.getUpdateBlogMethod = getUpdateBlogMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.blog.BlogUpdateRequest, net.ontopsolutions.blog.BlogUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("UpdateBlog"))
              .build();
        }
      }
    }
    return getUpdateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogDeleteRequest,
      net.ontopsolutions.blog.BlogDeleteResponse> getDeleteBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlog",
      requestType = net.ontopsolutions.blog.BlogDeleteRequest.class,
      responseType = net.ontopsolutions.blog.BlogDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogDeleteRequest,
      net.ontopsolutions.blog.BlogDeleteResponse> getDeleteBlogMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogDeleteRequest, net.ontopsolutions.blog.BlogDeleteResponse> getDeleteBlogMethod;
    if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
          BlogServiceGrpc.getDeleteBlogMethod = getDeleteBlogMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.blog.BlogDeleteRequest, net.ontopsolutions.blog.BlogDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("DeleteBlog"))
              .build();
        }
      }
    }
    return getDeleteBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogListRequest,
      net.ontopsolutions.blog.BlogListResponse> getListBlogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBlogs",
      requestType = net.ontopsolutions.blog.BlogListRequest.class,
      responseType = net.ontopsolutions.blog.BlogListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogListRequest,
      net.ontopsolutions.blog.BlogListResponse> getListBlogsMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.blog.BlogListRequest, net.ontopsolutions.blog.BlogListResponse> getListBlogsMethod;
    if ((getListBlogsMethod = BlogServiceGrpc.getListBlogsMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getListBlogsMethod = BlogServiceGrpc.getListBlogsMethod) == null) {
          BlogServiceGrpc.getListBlogsMethod = getListBlogsMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.blog.BlogListRequest, net.ontopsolutions.blog.BlogListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBlogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.blog.BlogListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ListBlogs"))
              .build();
        }
      }
    }
    return getListBlogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub>() {
        @java.lang.Override
        public BlogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceStub(channel, callOptions);
        }
      };
    return BlogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub>() {
        @java.lang.Override
        public BlogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceBlockingStub(channel, callOptions);
        }
      };
    return BlogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub>() {
        @java.lang.Override
        public BlogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceFutureStub(channel, callOptions);
        }
      };
    return BlogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlog(net.ontopsolutions.blog.BlogCreateRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBlogMethod(), responseObserver);
    }

    /**
     */
    public void readBlog(net.ontopsolutions.blog.BlogReadRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadBlogMethod(), responseObserver);
    }

    /**
     */
    public void updateBlog(net.ontopsolutions.blog.BlogUpdateRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBlogMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlog(net.ontopsolutions.blog.BlogDeleteRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBlogMethod(), responseObserver);
    }

    /**
     */
    public void listBlogs(net.ontopsolutions.blog.BlogListRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBlogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.ontopsolutions.blog.BlogCreateRequest,
                net.ontopsolutions.blog.BlogCreateResponse>(
                  this, METHODID_CREATE_BLOG)))
          .addMethod(
            getReadBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.ontopsolutions.blog.BlogReadRequest,
                net.ontopsolutions.blog.BlogReadResponse>(
                  this, METHODID_READ_BLOG)))
          .addMethod(
            getUpdateBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.ontopsolutions.blog.BlogUpdateRequest,
                net.ontopsolutions.blog.BlogUpdateResponse>(
                  this, METHODID_UPDATE_BLOG)))
          .addMethod(
            getDeleteBlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.ontopsolutions.blog.BlogDeleteRequest,
                net.ontopsolutions.blog.BlogDeleteResponse>(
                  this, METHODID_DELETE_BLOG)))
          .addMethod(
            getListBlogsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                net.ontopsolutions.blog.BlogListRequest,
                net.ontopsolutions.blog.BlogListResponse>(
                  this, METHODID_LIST_BLOGS)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractAsyncStub<BlogServiceStub> {
    private BlogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlog(net.ontopsolutions.blog.BlogCreateRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readBlog(net.ontopsolutions.blog.BlogReadRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlog(net.ontopsolutions.blog.BlogUpdateRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlog(net.ontopsolutions.blog.BlogDeleteRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBlogs(net.ontopsolutions.blog.BlogListRequest request,
        io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListBlogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.ontopsolutions.blog.BlogCreateResponse createBlog(net.ontopsolutions.blog.BlogCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.ontopsolutions.blog.BlogReadResponse readBlog(net.ontopsolutions.blog.BlogReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.ontopsolutions.blog.BlogUpdateResponse updateBlog(net.ontopsolutions.blog.BlogUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.ontopsolutions.blog.BlogDeleteResponse deleteBlog(net.ontopsolutions.blog.BlogDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<net.ontopsolutions.blog.BlogListResponse> listBlogs(
        net.ontopsolutions.blog.BlogListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListBlogsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.ontopsolutions.blog.BlogCreateResponse> createBlog(
        net.ontopsolutions.blog.BlogCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.ontopsolutions.blog.BlogReadResponse> readBlog(
        net.ontopsolutions.blog.BlogReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.ontopsolutions.blog.BlogUpdateResponse> updateBlog(
        net.ontopsolutions.blog.BlogUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.ontopsolutions.blog.BlogDeleteResponse> deleteBlog(
        net.ontopsolutions.blog.BlogDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG = 0;
  private static final int METHODID_READ_BLOG = 1;
  private static final int METHODID_UPDATE_BLOG = 2;
  private static final int METHODID_DELETE_BLOG = 3;
  private static final int METHODID_LIST_BLOGS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG:
          serviceImpl.createBlog((net.ontopsolutions.blog.BlogCreateRequest) request,
              (io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogCreateResponse>) responseObserver);
          break;
        case METHODID_READ_BLOG:
          serviceImpl.readBlog((net.ontopsolutions.blog.BlogReadRequest) request,
              (io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogReadResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG:
          serviceImpl.updateBlog((net.ontopsolutions.blog.BlogUpdateRequest) request,
              (io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLOG:
          serviceImpl.deleteBlog((net.ontopsolutions.blog.BlogDeleteRequest) request,
              (io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogDeleteResponse>) responseObserver);
          break;
        case METHODID_LIST_BLOGS:
          serviceImpl.listBlogs((net.ontopsolutions.blog.BlogListRequest) request,
              (io.grpc.stub.StreamObserver<net.ontopsolutions.blog.BlogListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.ontopsolutions.blog.BlogOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogService");
    }
  }

  private static final class BlogServiceFileDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier {
    BlogServiceFileDescriptorSupplier() {}
  }

  private static final class BlogServiceMethodDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceFileDescriptorSupplier())
              .addMethod(getCreateBlogMethod())
              .addMethod(getReadBlogMethod())
              .addMethod(getUpdateBlogMethod())
              .addMethod(getDeleteBlogMethod())
              .addMethod(getListBlogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
