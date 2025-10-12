package com.github.linyuzai.concept.plugin.sample.observable;

public class OpenAI implements AI {

    @Override
    public void ai() {
        System.out.println("exec by open ai");
    }

    @Override
    public String getName() {
        return "openai";
    }
}
