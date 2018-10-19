package com.wqq.spring.controller;

public class Car {
    public Car(){
        System.out.println("Car Constructor....");
    }
    private String brand;
    public void setBrand(String brand){
        System.out.println("setBrand["+brand+"]");
        this.brand=brand;
    }

    public void init(){
        System.out.println("init....");
    }
    public void destroy(){
        System.out.println("destory....");
    }
}
