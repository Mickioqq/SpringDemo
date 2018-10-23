package com.wqq.spring.controller.bean_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法,急需要先创建本身，再利用工厂创建bean实例
 */
public class InstanceCarFactory {
    private Map<String,Car> cars=null;
    public InstanceCarFactory(){
        cars=new HashMap<String,Car>();
        cars.put("BaoMa",new Car("BaoMa",300000));
        cars.put("DaZhong",new Car("DaZhong",100000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }


}
