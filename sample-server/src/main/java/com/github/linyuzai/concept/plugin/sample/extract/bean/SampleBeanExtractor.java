package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.extract.ExtractApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import com.github.linyuzai.plugin.core.handle.extract.match.PluginEntry;
import org.springframework.stereotype.Component;

@Component
public class SampleBeanExtractor extends BeanExtractor<ExtractApi> {

    @Override
    public void onExtract(@PluginEntry("**/BeanExtractApi.class") ExtractApi plugin,
                          PluginContext context) {
        plugin.exec();
    }
}
