package com.github.linyuzai.concept.plugin.sample.observable;

import com.github.linyuzai.plugin.autoconfigure.observable.GenericPluginObservable;
import com.github.linyuzai.plugin.autoconfigure.observable.PluginObservable;
import com.github.linyuzai.plugin.core.context.PluginContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    public PluginObservable<String, AI> aiPluginObservable() {
        return new GenericPluginObservable<>() {
            @Override
            public String grouping(AI plugin, PluginContext context) {
                return plugin.getName();
            }
        };
    }
}
