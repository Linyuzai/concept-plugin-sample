package com.github.linyuzai.concept.plugin.sample.server.extract.clazz;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractClassApi;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.jar.handle.extract.ClassExtractor;
import com.github.linyuzai.plugin.jar.handle.extract.match.PluginClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.AbstractList;
import java.util.Arrays;

@Slf4j
@Component
public class SampleClassArrayExtractor extends ClassExtractor<Class<? extends ExtractClassApi>[]> {

    @Override
    public void onExtract(@PluginClass(AbstractList.class) Class<? extends ExtractClassApi>[] plugin,
                          PluginContext context) {
        Utils.wrap(log, "class array", () -> System.out.println(Arrays.toString(plugin)));
    }
}
