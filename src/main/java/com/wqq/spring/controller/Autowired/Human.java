package com.wqq.spring.controller.Autowired;

public class Human {
    private  City city;
    private  Car car;

    private String name;

    @Override
    public String toString() {
        return "Human{" +
                "city=" + city +
                ", car=" + car +
                ", name='" + name + '\'' +
                '}';
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
