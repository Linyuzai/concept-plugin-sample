package com.github.linyuzai.concept.plugin.sample.extract.properties;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Properties;

@Slf4j
@Component
public class SamplePropertiesListExtractor extends PropertiesExtractor<List<? extends Properties>> {

    @Override
    public void onExtract(@PluginEntry("**/sample.properties") List<? extends Properties> plugin, PluginContext context) {
        Utils.wrap(log, "properties list", () -> System.out.println(plugin));
    }
}
