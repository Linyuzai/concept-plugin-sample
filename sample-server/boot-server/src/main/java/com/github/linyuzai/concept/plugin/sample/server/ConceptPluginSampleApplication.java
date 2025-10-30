package com.github.linyuzai.concept.plugin.sample.server;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.github.linyuzai.plugin.autoconfigure.EnablePluginConcept;
import com.github.linyuzai.plugin.core.concept.Plugin;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.listener.PluginListener;
import io.minio.MinioClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;

@EnablePluginConcept
@SpringBootApplication(scanBasePackages = Packages.OBSERVABLE)
public class ConceptPluginSampleApplication {

    public static void main(String[] args) {
        System.setProperty("aws.java.v1.disableDeprecationAnnouncement", "true");
        SpringApplication.run(ConceptPluginSampleApplication.class, args);
    }

    public static final String HOST = "http://192.168.0.104:9090";
    //public static final String HOST = "http://192.168.101.44:9090";

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(HOST)
                .credentials("minioadmin", "minioadmin")
                .build();
    }

    @Bean
    public S3Client s3Client() {
        return S3Client.builder()
                .endpointOverride(URI.create(HOST))
                .region(Region.US_EAST_1)
                .credentialsProvider(StaticCredentialsProvider
                        .create(AwsBasicCredentials.create("minioadmin", "minioadmin"))) // 设置凭证提供者
                .forcePathStyle(true)
                .build();
    }

    @Bean
    public AmazonS3 amazonS3() {
        return AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials("minioadmin", "minioadmin")))
                .withEndpointConfiguration(new AwsClientBuilder
                        .EndpointConfiguration(HOST, Regions.US_EAST_1.getName()))
                .withPathStyleAccessEnabled(true)
                .build();
    }

    @Bean
    public PluginListener pluginListener() {
        return new PluginListener() {

            @Override
            public void onLoad(Plugin plugin, PluginContext context) {
                System.out.println("onLoad:" + plugin.getDefinition().getName());
            }

            @Override
            public void onUnload(Plugin plugin) {
                System.out.println("onUnload:" + plugin.getDefinition().getName());
            }
        };
    }
}
