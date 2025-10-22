package com.github.linyuzai.concept.plugin.sample.observable;

public class ChatGPT implements AI {

    @Override
    public void ai() {
        System.out.println("exec by chatgpt");
    }

    @Override
    public String getName() {
        return "chatgpt";
    }
}
