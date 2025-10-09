package com.github.linyuzai.concept.plugin.sample.nested;

import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import org.springframework.stereotype.Component;

@Component
public class SampleNestedExtractor extends BeanExtractor<NestedApi> {

    @Override
    public void onExtract(NestedApi plugin, PluginContext context) {
        plugin.exec();
    }
}
