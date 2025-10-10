package com.github.linyuzai.concept.plugin.sample.extract;

@ExtractAnnotation
public class ClassAnnotationExtractClassApi implements ExtractClassApi {

    @Override
    public void exec() {
        System.out.println("exec by class annotation extract api");
    }
}
