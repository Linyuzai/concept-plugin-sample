package com.github.linyuzai.concept.plugin.sample;

import com.github.linyuzai.plugin.autoconfigure.EnablePluginConcept;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnablePluginConcept
@SpringBootApplication(scanBasePackages = Packages.EXTRACT_BEAN)
public class ConceptPluginSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConceptPluginSampleApplication.class, args);
    }
}
