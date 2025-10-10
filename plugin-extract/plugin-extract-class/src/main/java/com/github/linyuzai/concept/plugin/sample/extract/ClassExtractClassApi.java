package com.github.linyuzai.concept.plugin.sample.extract;

import java.util.AbstractList;

public class ClassExtractClassApi extends AbstractList<Object> implements ExtractClassApi {

    @Override
    public void exec() {
        System.out.println("exec by class extract api extends AbstractList");
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
