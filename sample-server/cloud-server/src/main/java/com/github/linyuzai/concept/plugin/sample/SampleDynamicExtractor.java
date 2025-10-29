package com.github.linyuzai.concept.plugin.sample;

import com.github.linyuzai.plugin.core.handle.extract.OnPluginExtract;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Slf4j
@Component
public class SampleDynamicExtractor {

    @OnPluginExtract
    public void onDynamicExtract(@PluginEntry("content/**") Map<String, String> contentMap,
                                 @PluginEntry("**/sample.properties") List<? extends Properties> propertiesList,
                                 @PluginEntry({"**/sample.yaml", "**/sample.yml"}) List<? extends Properties> yamlLIst) {
        Utils.wrap(log, "content map", () -> System.out.println(contentMap));
        Utils.wrap(log, "properties list", () -> System.out.println(propertiesList));
        Utils.wrap(log, "yaml list", () -> System.out.println(yamlLIst));
    }
}
