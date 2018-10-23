package com.wqq.spring.controller.spring_SpEL;

public class City {
    private String cityName;

    private String street;

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
