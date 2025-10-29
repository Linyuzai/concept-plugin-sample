package com.github.linyuzai.concept.plugin.sample.extract.yaml;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import com.github.linyuzai.plugin.core.metadata.PluginMetadata;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.util.Properties;

@Slf4j
@Component
public class SampleYamlExtractor extends PropertiesExtractor<Properties> {

    @Override
    public void onExtract(@PluginEntry("**/sample.yaml") Properties plugin, PluginContext context) {
        Utils.wrap(log, "yaml entry", () -> {
            System.out.println(plugin);
            PluginMetadata metadata = context.getPlugin().getMetadata();
            System.out.println("concept.plugin.name=" + metadata.get("concept.plugin.name"));
            CustomData data = context.getPlugin().getMetadata().bind("custom", CustomData.class);
            System.out.println(data);
        });
    }

    @Data
    public static class CustomData {

        private String a;

        private String b;
    }
}
