package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.extract.ExtractApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class SampleBeanListExtractor extends BeanExtractor<List<? extends ExtractApi>> {

    @Override
    public void onExtract(List<? extends ExtractApi> plugin,
                          PluginContext context) {
        plugin.forEach(ExtractApi::exec);
    }
}
