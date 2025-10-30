package com.github.linyuzai.concept.plugin.sample.server.common;

import com.github.linyuzai.concept.plugin.sample.common.CommonApi;
import com.github.linyuzai.concept.plugin.sample.server.Utils;
import com.github.linyuzai.plugin.autoconfigure.bean.BeanExtractor;
import com.github.linyuzai.plugin.core.context.PluginContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleCommonExtractor extends BeanExtractor<CommonApi> {

    @Override
    public void onExtract(CommonApi plugin, PluginContext context) {
        Utils.wrap(log, "common", plugin::exec);
    }
}
