package com.github.linyuzai.concept.plugin.sample.observable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web2")
public class Web2Controller {

    @GetMapping("/a")
    @ResponseBody
    public String a() {
        return "web2-a";
    }

    @GetMapping("/b")
    @ResponseBody
    public String b() {
        return "web2-b";
    }
}
