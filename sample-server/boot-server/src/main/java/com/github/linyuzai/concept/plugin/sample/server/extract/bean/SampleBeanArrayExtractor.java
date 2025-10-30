package com.github.linyuzai.concept.plugin.sample.server.extract.bean;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractBeanApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class SampleBeanArrayExtractor extends BeanExtractor<ExtractBeanApi[]> {

    @Override
    public void onExtract(ExtractBeanApi[] plugin,
                          PluginContext context) {
        Utils.wrap(log, "bean array", () -> Arrays.stream(plugin).forEach(ExtractBeanApi::exec));
    }
}
