package com.github.linyuzai.concept.plugin.sample.extract.bean;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractBeanApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Set;

@Slf4j
@Component
public class SampleBeanSetExtractor extends BeanExtractor<Set<? extends ExtractBeanApi>> {

    @Override
    public void onExtract(Set<? extends ExtractBeanApi> plugin,
                          PluginContext context) {
        Utils.usage(log, "bean set", () -> plugin.forEach(ExtractBeanApi::exec));
    }
}
