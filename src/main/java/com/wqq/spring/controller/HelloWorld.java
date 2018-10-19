package com.wqq.spring.controller;

public class HelloWorld {
    private String name;
    public void setName(String name){
        System.out.println("name init.....");
      this.name=name;
    }
    public void SayHello(){
        System.out.println("hello" +name);
    }
    public HelloWorld(){
        System.out.println("Construct Init.....");
    }
}
