package com.github.linyuzai.concept.plugin.sample.server.extract.clazz;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractClassApi;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.jar.handle.extract.ClassExtractor;
import com.github.linyuzai.plugin.jar.handle.extract.match.PluginClassName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleClassExtractor extends ClassExtractor<Class<? extends ExtractClassApi>> {

    @Override
    public void onExtract(@PluginClassName("com.github.linyuzai.concept.plugin.sample.extract.ClassNameExtractClassApi")
                          Class<? extends ExtractClassApi> plugin, PluginContext context) {
        Utils.wrap(log, "class entry", () -> System.out.println(plugin.getName()));
    }
}
