package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.extract.ExtractApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;

import java.util.Arrays;
import java.util.List;

//@Component
public class SampleBeanArrayExtractor extends BeanExtractor<ExtractApi[]> {

    @Override
    public void onExtract(ExtractApi[] plugin,
                          PluginContext context) {
        Arrays.stream(plugin).forEach(ExtractApi::exec);
    }
}
