package com.github.linyuzai.concept.plugin.sample.extract.yaml;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Properties;

@Slf4j
@Component
public class SampleYamlMapExtractor extends PropertiesExtractor<Map<String, ? extends Properties>> {

    @Override
    public void onExtract(@PluginEntry({"**/sample.yaml", "**/sample.yml"}) Map<String, ? extends Properties> plugin,
                          PluginContext context) {
        Utils.wrap(log, "yaml map", () -> System.out.println(plugin));
    }
}
