package com.github.linyuzai.concept.plugin.sample.extract;

@ExtractAnnotation
public class ClassAnnotationExtractApi implements ExtractApi {

    @Override
    public void exec() {
        System.out.println("exec by class annotation extract api");
    }
}
