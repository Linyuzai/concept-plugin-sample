package com.github.linyuzai.concept.plugin.sample.server.extract.bean;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractBeanApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleBeanExtractor extends BeanExtractor<ExtractBeanApi> {

    @Override
    public void onExtract(@PluginEntry("**/ExtractBeanApiImpl.class") ExtractBeanApi plugin,
                          PluginContext context) {
        Utils.wrap(log, "bean entry", plugin::exec);
    }
}
