package com.github.linyuzai.concept.plugin.sample.extract.clazz;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractAnnotation;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractClassApi;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.jar.handle.extract.ClassExtractor;
import com.github.linyuzai.plugin.jar.handle.extract.match.PluginClassAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Set;

@Slf4j
@Component
public class SampleClassSetExtractor extends ClassExtractor<Set<Class<? extends ExtractClassApi>>> {

    @Override
    public void onExtract(@PluginClassAnnotation(ExtractAnnotation.class) Set<Class<? extends ExtractClassApi>> plugin,
                          PluginContext context) {
        Utils.usage(log, "class set", () -> System.out.println(plugin));
    }
}
