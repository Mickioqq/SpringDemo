package com.wqq.spring.controller;

public class NewCar {
    private String brand;
    private String carNum;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public int getHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(int highSpeed) {
        this.highSpeed = highSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private int highSpeed;

    @Override
    public String toString() {
        return "NewCar{" +
                "brand='" + brand + '\'' +
                ", carNum='" + carNum + '\'' +
                ", highSpeed=" + highSpeed +
                ", price=" + price +
                '}';
    }

    private double price;

    public NewCar(String brand, String carNum, double price) {
        this.brand = brand;
        this.carNum = carNum;
        this.price = price;
    }

    public NewCar(String brand,String carNum,int highSpeed){
        this.brand = brand;
        this.carNum = carNum;
        this.highSpeed = highSpeed;
    }
    public NewCar(){

    }

    public static class Person {
        private String name;
        private int age;
        private NewCar newCar;

        public Person(String name, int age, NewCar newCar) {
            this.name = name;
            this.age = age;
            this.newCar = newCar;
        }

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

        @Override
        public String toString() {
            return "Person{" +
                    "name=" + name +
                    ", age=" + age +
                    ", newCar=" + newCar +
                    '}';
        }

        public NewCar getNewCar() {
            return newCar;
        }

        public void setNewCar(NewCar newCar) {
            this.newCar = newCar;
        }

        public Person(){


        }

    }
}
