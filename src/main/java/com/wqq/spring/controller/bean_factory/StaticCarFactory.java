package com.wqq.spring.controller.bean_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法:直接调用某一个类的静态方法，返回一个bean
 */
public class StaticCarFactory {
    private  static Map<String,Car> cars=new HashMap<String,Car>();
    static {

        cars.put("audi",new Car("Audi",30000));
        cars.put("ford",new Car("Ford",10000));
    }
//静态工厂方法
    public static Car getCar(String name){
        return cars.get(name);
    }
}
