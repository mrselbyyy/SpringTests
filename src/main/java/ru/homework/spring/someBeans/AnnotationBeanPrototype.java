package ru.homework.spring.someBeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("annotationBeanPrototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AnnotationBeanPrototype {
    @Value("Name for dependent")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnnotationBeanPrototype() {
    }

    public AnnotationBeanPrototype(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init (){
        System.out.println("Init method from Annotation bean");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method from Annotation bean");
    }
}
