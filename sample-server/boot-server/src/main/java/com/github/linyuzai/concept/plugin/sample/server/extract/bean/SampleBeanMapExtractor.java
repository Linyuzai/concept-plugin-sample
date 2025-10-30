package com.github.linyuzai.concept.plugin.sample.server.extract.bean;

import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.concept.plugin.sample.extract.ExtractBeanApi;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SampleBeanMapExtractor extends BeanExtractor<Map<String, ? extends ExtractBeanApi>> {

    @Override
    public void onExtract(Map<String, ? extends ExtractBeanApi> plugin,
                          PluginContext context) {
        Utils.wrap(log, "bean map", () -> {
            System.out.println(plugin.toString());
            plugin.values().forEach(ExtractBeanApi::exec);
        });
    }
}
