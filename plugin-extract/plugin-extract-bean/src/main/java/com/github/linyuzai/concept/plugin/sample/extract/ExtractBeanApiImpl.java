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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class ExtractBeanApiImpl implements ExtractBeanApi, InitializingBean, DisposableBean, EnvironmentAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void exec() {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("text.txt")) {
            System.out.println("exec by extract bean api impl with application context: " + applicationContext +
                    ", read resources: '" + inputStreamToString(is) + "'");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
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

    public static String inputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }

}
