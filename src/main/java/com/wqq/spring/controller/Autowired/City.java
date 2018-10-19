package com.wqq.spring.controller.Autowired;

public class City {
    private String address;
    private String street;

    @Override
    public String toString() {
        return "City{" +
                "address='" + address + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
