package com.github.linyuzai.concept.plugin.sample.nested;

public class NestedApiImpl implements NestedApi {

    @Override
    public void exec() {
        NestedDependency nestedDependency = new NestedDependency();
        System.out.println("exec by nested api impl with dependency:" + nestedDependency);
    }
}
