package com.github.linyuzai.concept.plugin.sample.extract;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanExtractApi implements ExtractApi, InitializingBean, DisposableBean, EnvironmentAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void exec() {
        System.out.println("exec by bean extract api with application context: " + applicationContext);
    }

    @PostConstruct
    public void initByPostConstruct() {
        System.out.println("initByPostConstruct");
    }

    @PreDestroy
    public void destroyByPreDestroy() {
        System.out.println("destroyByPreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initByInitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroyByDisposableBean");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("EnvironmentAware: " + environment);
    }
}
