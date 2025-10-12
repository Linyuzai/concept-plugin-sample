package com.github.linyuzai.concept.plugin.sample.extract.content;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.ContentExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SampleContentMapExtractor extends ContentExtractor<Map<String, String>> {

    @PluginEntry("content/**")
    @Override
    public void onExtract(Map<String, String> plugin, PluginContext context) {
        Utils.usage(log, "content map", () -> System.out.println(plugin));
    }
}
