package com.github.linyuzai.concept.plugin.sample.common;

public class CommonApiImpl implements CommonApi {

    @Override
    public void exec() {
        CommonDependency commonDependency = new CommonDependency();
        System.out.println("exec by common api impl with dependency:" + commonDependency);
    }
}
