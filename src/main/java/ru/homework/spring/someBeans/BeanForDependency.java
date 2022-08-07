package ru.homework.spring.someBeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BeanForDependency {

    private String someName;
    @Autowired
    private AnnotationBeanPrototype dependent;

    public BeanForDependency() {
    }

    public BeanForDependency(String someName, AnnotationBeanPrototype dependent) {
        this.someName = someName;
        this.dependent = dependent;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public AnnotationBeanPrototype getDependent() {
        return dependent;
    }

    public void setDependent(AnnotationBeanPrototype dependent) {
        this.dependent = dependent;
    }
    @PostConstruct
    public void dependencyInitMethod(){
        System.out.println("Dependency init method complete");
    }

}
