package com.github.linyuzai.concept.plugin.sample.server.extract.yaml;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Properties;

@Slf4j
@Component
public class SampleYamlListExtractor extends PropertiesExtractor<List<? extends Properties>> {

    @Override
    public void onExtract(@PluginEntry({"**/sample.yaml", "**/sample.yml"}) List<? extends Properties> plugin,
                          PluginContext context) {
        Utils.wrap(log, "yaml list", () -> System.out.println(plugin));
    }
}
