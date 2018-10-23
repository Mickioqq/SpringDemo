package com.wqq.spring.controller.spring_SpEL;

public class Person {

    private  Computer computer;

    private String name;

    private String cityName;

    @Override
    public String toString() {
        return "Person{" +
                "computer=" + computer +
                ", name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
