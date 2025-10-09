package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.extract.ExtractApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;

import java.util.List;
import java.util.Set;

//@Component
public class SampleBeanSetExtractor extends BeanExtractor<Set<? extends ExtractApi>> {

    @Override
    public void onExtract(Set<? extends ExtractApi> plugin,
                          PluginContext context) {
        plugin.forEach(ExtractApi::exec);
    }
}
