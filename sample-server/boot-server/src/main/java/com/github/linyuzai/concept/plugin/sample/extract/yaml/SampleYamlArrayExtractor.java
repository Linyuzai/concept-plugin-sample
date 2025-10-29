package com.github.linyuzai.concept.plugin.sample.extract.yaml;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.PropertiesExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Properties;

@Slf4j
@Component
public class SampleYamlArrayExtractor extends PropertiesExtractor<Properties[]> {

    @Override
    public void onExtract(@PluginEntry({"**/sample.yaml", "**/sample.yml"}) Properties[] plugin,
                          PluginContext context) {
        Utils.wrap(log, "yaml array", () -> System.out.println(Arrays.toString(plugin)));
    }
}
