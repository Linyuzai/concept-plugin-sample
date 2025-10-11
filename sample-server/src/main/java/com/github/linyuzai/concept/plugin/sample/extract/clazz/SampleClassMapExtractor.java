package com.github.linyuzai.concept.plugin.sample.extract.clazz;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractClassApi;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.jar.handle.extract.ClassExtractor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SampleClassMapExtractor extends ClassExtractor<Map<String, Class<? extends ExtractClassApi>>> {

    @Override
    public void onExtract(Map<String, Class<? extends ExtractClassApi>> plugin, PluginContext context) {
        Utils.usage(log, "class map", () -> System.out.println(plugin.toString()));
    }
}
