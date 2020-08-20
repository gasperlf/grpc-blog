package net.ontopsolutions.blog.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.ontopsolutions.blog.Blog;
import net.ontopsolutions.blog.BlogCreateRequest;
import net.ontopsolutions.blog.BlogCreateResponse;
import net.ontopsolutions.blog.BlogDeleteRequest;
import net.ontopsolutions.blog.BlogDeleteResponse;
import net.ontopsolutions.blog.BlogListRequest;
import net.ontopsolutions.blog.BlogListResponse;
import net.ontopsolutions.blog.BlogReadRequest;
import net.ontopsolutions.blog.BlogReadResponse;
import net.ontopsolutions.blog.BlogServiceGrpc;
import net.ontopsolutions.blog.BlogUpdateRequest;
import net.ontopsolutions.blog.BlogUpdateResponse;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class BlogServiceImpl extends BlogServiceGrpc.BlogServiceImplBase {

    private final MongoClient mongoClient = MongoClients.create("mongodb://root:example@localhost:27017");
    private final MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");
    private final MongoCollection<Document> collection = mongoDatabase.getCollection("blog");

    @Override
    public void createBlog(BlogCreateRequest request, StreamObserver<BlogCreateResponse> responseObserver) {
        System.out.println("Received message to create blog");

        Blog blog = request.getBlog();

        Document document = new Document("author_id", blog.getAuthorId())
                .append("title", blog.getTitle())
                .append("content", blog.getContent());

        System.out.println("Inserting blog");
        collection.insertOne(document);

        String id = document.getObjectId("_id").toString();
        System.out.println("Inserted blog " + id);

        BlogCreateResponse blogResponse = BlogCreateResponse
                .newBuilder().
                        setBlog(documentToBlog(document))
                .build();

        System.out.println("Response blog");
        responseObserver.onNext(blogResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void readBlog(BlogReadRequest request, StreamObserver<BlogReadResponse> responseObserver) {

        System.out.println("Received message to read blog");
        ObjectId objectId = null;
        try {
            objectId = new ObjectId(request.getBlogId());
        } catch (IllegalArgumentException e) {
            responseObserver
                    .onError(Status
                            .INVALID_ARGUMENT
                            .withDescription("The blogId=" + request.getBlogId() + "is not allowed")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException());
            responseObserver.onCompleted();
        }

        Document document = collection.find(eq("_id", objectId)).first();
        if (document == null) {
            responseObserver
                    .onError(Status
                            .NOT_FOUND
                            .withDescription("The blog with id=" + request.getBlogId() + "was not found")
                            .asRuntimeException());
        } else {
            Blog blog = documentToBlog(document);
            responseObserver.onNext(BlogReadResponse.newBuilder().setBlog(blog).build());
            responseObserver.onCompleted();
        }


    }

    @Override
    public void updateBlog(BlogUpdateRequest request, StreamObserver<BlogUpdateResponse> responseObserver) {

        System.out.println("Received message to update blog");
        String blogId = request.getBlog().getId();
        Document document = null;
        try {
            ObjectId objectId = new ObjectId(blogId);
            System.out.println("Searching blog... ");
            document = collection.find(eq("_id", objectId)).first();
        } catch (Exception e) {
            responseObserver
                    .onError(Status
                            .NOT_FOUND
                            .withDescription("The blogId=" + blogId + "is not allowed")
                            .augmentDescription(e.getLocalizedMessage())
                            .asRuntimeException());
            responseObserver.onCompleted();
        }

        if (document == null) {
            responseObserver
                    .onError(Status
                            .NOT_FOUND
                            .withDescription("The blog with id=" + blogId + "was not found")
                            .asRuntimeException());
        } else {
            Document replacement = new Document("author_id", request.getBlog().getAuthorId())
                    .append("title", request.getBlog().getTitle())
                    .append("content", request.getBlog().getContent());

            collection.replaceOne(eq("_id", document.getObjectId("_id")), replacement);

            Blog blogUpdate = documentToBlog(document);
            BlogUpdateResponse response = BlogUpdateResponse.newBuilder().setBlog(blogUpdate).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteBlog(BlogDeleteRequest request, StreamObserver<BlogDeleteResponse> responseObserver) {

        String blogId = request.getBlogId();
        try {
            DeleteResult result = collection.deleteOne(eq("_id", new ObjectId(blogId)));

            if (result.getDeletedCount() == 0) {
                responseObserver.onNext(BlogDeleteResponse.newBuilder().setResult(false).build());
            } else {
                responseObserver.onNext(BlogDeleteResponse.newBuilder().setResult(true).build());
            }
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver
                    .onError(Status
                            .NOT_FOUND
                            .withDescription("The blog with id=" + blogId + "was not found")
                            .augmentDescription("The blog can't delete")
                            .asRuntimeException());
        }
    }

    @Override
    public void listBlogs(BlogListRequest request, StreamObserver<BlogListResponse> responseObserver) {
        System.out.println("Received List blog  request");
        collection.find().forEach(document -> responseObserver
                .onNext(BlogListResponse
                        .newBuilder()
                        .setBlog(documentToBlog(document))
                        .build()));

        responseObserver.onCompleted();
    }

    private Blog documentToBlog(Document document) {
        return Blog.newBuilder()
                .setId(document.getObjectId("_id").toString())
                .setAuthorId(document.getString("author_id"))
                .setTitle(document.getString("title"))
                .setContent(document.getString("content"))
                .build();
    }
}
