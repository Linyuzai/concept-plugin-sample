package com.github.linyuzai.concept.plugin.sample.server.extract.content;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.ContentExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleContentExtractor extends ContentExtractor<byte[]> {

    @Override
    public void onExtract(@PluginEntry("**/sample1.txt") byte[] plugin, PluginContext context) {
        Utils.wrap(log, "content entry", () -> System.out.println(new String(plugin)));
    }
}
