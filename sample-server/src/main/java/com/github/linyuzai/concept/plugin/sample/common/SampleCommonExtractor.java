package com.github.linyuzai.concept.plugin.sample.common;

import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import org.springframework.stereotype.Component;

@Component
public class SampleCommonExtractor extends BeanExtractor<CommonApi> {

    @Override
    public void onExtract(CommonApi plugin, PluginContext context) {
        plugin.exec();
    }
}
