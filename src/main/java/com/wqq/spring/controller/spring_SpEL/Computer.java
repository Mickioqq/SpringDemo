package com.wqq.spring.controller.spring_SpEL;

public class Computer {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private  String brand;

    private  double price;

}
