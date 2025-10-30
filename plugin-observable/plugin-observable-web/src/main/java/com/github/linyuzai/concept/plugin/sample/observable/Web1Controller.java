package com.github.linyuzai.concept.plugin.sample.observable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web1")
public class Web1Controller {

    @GetMapping("/a")
    public String a() {
        return "web1-a";
    }

    @GetMapping("/b")
    public String b() {
        return "web1-b";
    }
}
