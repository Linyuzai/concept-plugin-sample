package com.github.linyuzai.concept.plugin.sample.observable;

public class DeekSeek implements AI {

    @Override
    public void ai() {
        System.out.println("exec by deep seek");
    }

    @Override
    public String getName() {
        return "deepseek";
    }
}
