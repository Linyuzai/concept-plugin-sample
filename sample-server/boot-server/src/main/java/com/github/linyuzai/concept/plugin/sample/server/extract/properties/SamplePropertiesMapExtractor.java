package com.github.linyuzai.concept.plugin.sample.server.extract.properties;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Properties;

@Slf4j
@Component
public class SamplePropertiesMapExtractor extends PropertiesExtractor<Map<String, ? extends Properties>> {

    @Override
    public void onExtract(@PluginEntry("**/sample.properties") Map<String, ? extends Properties> plugin, PluginContext context) {
        Utils.wrap(log, "properties map", () -> System.out.println(plugin));
    }
}
