package com.github.linyuzai.concept.plugin.sample.nested;

import com.github.linyuzai.concept.plugin.sample.Utils;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleNestedExtractor extends BeanExtractor<NestedApi> {

    @Override
    public void onExtract(NestedApi plugin, PluginContext context) {
        Utils.wrap(log, "nested", plugin::exec);
    }
}
