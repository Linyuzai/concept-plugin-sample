package com.github.linyuzai.concept.plugin.sample.extract.content;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.ContentExtractor;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class SampleContentListExtractor extends ContentExtractor<List<InputStream>> {

    @PluginEntry("content/**")
    @Override
    public void onExtract(List<InputStream> plugin, PluginContext context) {
        Utils.wrap(log, "content list", () -> System.out.println(plugin.stream()
                .map(this::inputStreamToString).collect(Collectors.toList())));
    }

    @SneakyThrows
    private String inputStreamToString(InputStream is) {
        return IOUtils.toString(is, Charset.defaultCharset());
    }
}
