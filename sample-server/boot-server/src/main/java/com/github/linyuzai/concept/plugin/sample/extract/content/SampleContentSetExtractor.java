package com.github.linyuzai.concept.plugin.sample.extract.content;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.ContentExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Component
public class SampleContentSetExtractor extends ContentExtractor<Set<ByteBuffer>> {

    @PluginEntry("content/**")
    @Override
    public void onExtract(Set<ByteBuffer> plugin, PluginContext context) {
        Utils.wrap(log, "content set", () -> System.out.println(plugin.stream()
                .map(it -> new String(it.array())).collect(Collectors.toSet())));
    }
}
