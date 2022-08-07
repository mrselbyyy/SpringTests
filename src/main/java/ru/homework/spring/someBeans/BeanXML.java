package ru.homework.spring.someBeans;


public class BeanXML {

    String name;

    public BeanXML() {
    }

    public BeanXML(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void initMethod() {
        System.out.println("Initialization first dependent bean complete");
    }


    public void destroyMethod() {
        System.out.println("Destroying first dependent bean complete");
    }

    public void initMethodForSingleton() {
        System.out.println("Initialization for singleton");
    }

}
