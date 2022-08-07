package ru.homework.spring.xmlConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.homework.spring.someBeans.AnnotationBeanPrototype;
import ru.homework.spring.someBeans.AnnotationBeanSingleton;
import ru.homework.spring.annotationConfiguration.Config;
import ru.homework.spring.someBeans.BeanForDependency;
import ru.homework.spring.someBeans.BeanXML;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        BeanXML testBean = context.getBean("testBeanPrototype", BeanXML.class);

        BeanXML secondBean = context.getBean("testBeanSingleton", BeanXML.class);


        System.out.println(testBean.getName());
        System.out.println(secondBean.getName());
        context.close();
        System.out.println("----------------------------");

        context.close();

        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(Config.class);

        AnnotationBeanPrototype annotationBeanPrototype
                = annotationContext.getBean("annotationBeanPrototype", AnnotationBeanPrototype.class);

        AnnotationBeanSingleton annotationBeanSingleton
                = annotationContext.getBean("annotationBeanSingleton", AnnotationBeanSingleton.class);

        BeanForDependency beanForDependency
                = annotationContext.getBean("beanForDependency", BeanForDependency.class);


        System.out.println(beanForDependency.getDependent().getName());



        annotationContext.close();
    }
}
