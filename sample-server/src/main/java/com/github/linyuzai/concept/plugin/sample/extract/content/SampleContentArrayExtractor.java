package com.github.linyuzai.concept.plugin.sample.extract.content;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.ContentExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class SampleContentArrayExtractor extends ContentExtractor<byte[][]> {

    @PluginEntry("content/**")
    @Override
    public void onExtract(byte[][] plugin, PluginContext context) {
        Utils.wrap(log, "content array", () ->
                System.out.println(Arrays.toString(Arrays.stream(plugin).map(String::new).toArray(String[]::new))));
    }
}
