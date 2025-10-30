package com.github.linyuzai.concept.plugin.sample.server.extract.clazz;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractClassApi;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.jar.handle.extract.ClassExtractor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SampleClassListExtractor extends ClassExtractor<List<Class<? extends ExtractClassApi>>> {

    @Override
    public void onExtract(List<Class<? extends ExtractClassApi>> plugin, PluginContext context) {
        Utils.wrap(log, "class list", () -> System.out.println(plugin));
    }
}
