package net.ontopsolutions.blog.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.health.v1.HealthCheckResponse;
import io.grpc.protobuf.services.ProtoReflectionService;
import io.grpc.services.HealthStatusManager;

import java.io.File;
import java.io.IOException;

public class BlogServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Starting server");
        HealthStatusManager healthStatusManager = new HealthStatusManager();

        Server server = createServer(healthStatusManager);
        server.start();
        healthStatusManager.setStatus("", HealthCheckResponse.ServingStatus.NOT_SERVING);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received shutdown server");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        System.out.println("Starting serving");
        healthStatusManager.setStatus("", HealthCheckResponse.ServingStatus.SERVING);
        server.awaitTermination();
    }

    private static Server createServer(HealthStatusManager health) {
        return ServerBuilder.forPort(50051)
                .addService(new BlogServiceImpl())
                .addService(ProtoReflectionService.newInstance()) //add for reflection
                .addService(health.getHealthService())
                .useTransportSecurity(new File("ssl/server.crt"),
                        new File("ssl/server.pem"))
                .build();
    }
}
