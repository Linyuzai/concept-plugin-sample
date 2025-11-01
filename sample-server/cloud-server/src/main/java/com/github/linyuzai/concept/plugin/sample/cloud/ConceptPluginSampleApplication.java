package com.github.linyuzai.concept.plugin.sample.cloud;

import com.github.linyuzai.plugin.autoconfigure.EnablePluginConcept;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;

@EnablePluginConcept
@SpringBootApplication
public class ConceptPluginSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConceptPluginSampleApplication.class, args);
    }

    public static final String HOST = "http://192.168.0.104:9090";
    //public static final String HOST = "http://192.168.101.44:9090";

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
}
