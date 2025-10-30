package com.github.linyuzai.concept.plugin.sample.server.observable;

import com.github.linyuzai.concept.plugin.sample.observable.AI;
import com.github.linyuzai.plugin.autoconfigure.observable.PluginObservable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

    @Autowired
    private PluginObservable<String, AI> aiPluginObservable;

    @RequestMapping("/{name}")
    public void ai(@PathVariable("name") String name) {
        System.out.println(aiPluginObservable.keys());
        AI ai = aiPluginObservable.get(name);
        if (ai == null) {
            System.out.println("AI not found: " + name);
        } else {
            ai.ai();
        }
    }
}
