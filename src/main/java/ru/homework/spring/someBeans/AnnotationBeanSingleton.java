package ru.homework.spring.someBeans;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("annotationBeanSingleton")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AnnotationBeanSingleton {

    private String name;

    @PostConstruct
    public void init (){
        System.out.println("Init method from Annotation bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method from Annotation bean");
    }
}
