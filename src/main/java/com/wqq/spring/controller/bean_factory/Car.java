package com.wqq.spring.controller.bean_factory;

public class Car {
    private  String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    private  double price;
}
