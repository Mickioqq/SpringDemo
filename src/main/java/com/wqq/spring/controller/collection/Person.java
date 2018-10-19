package com.wqq.spring.controller.collection;

import java.util.List;

public class Person {

    private  String name;

    private  int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computers=" + computers +
                '}';
    }

    private List<Computer> computers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
    /**
    public Person(String name, int age, List<Computer> computers) {
        this.name = name;
        this.age = age;
        this.computers = computers;
    }
   */

}
