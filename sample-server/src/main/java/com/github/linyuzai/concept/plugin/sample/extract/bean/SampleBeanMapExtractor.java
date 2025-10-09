package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.extract.ExtractApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;

import java.util.List;
import java.util.Map;

//@Component
public class SampleBeanMapExtractor extends BeanExtractor<Map<String, ? extends ExtractApi>> {

    @Override
    public void onExtract(Map<String, ? extends ExtractApi> plugin,
                          PluginContext context) {
        System.out.println(plugin);
        plugin.values().forEach(ExtractApi::exec);
    }
}
