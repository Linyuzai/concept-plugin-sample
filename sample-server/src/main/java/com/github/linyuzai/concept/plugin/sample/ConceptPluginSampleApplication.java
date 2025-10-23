package com.github.linyuzai.concept.plugin.sample;

import com.github.linyuzai.plugin.autoconfigure.EnablePluginConcept;
import io.minio.MinioClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnablePluginConcept
@SpringBootApplication(scanBasePackages = Packages.OBSERVABLE)
public class ConceptPluginSampleApplication {

    public static void main(String[] args) {
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
}
