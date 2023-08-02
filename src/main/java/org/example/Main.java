package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Car> map = new HashMap<>();


        Car newCar0 = new Car();
        newCar0.getNameList().add("new car0");
        newCar0.getNumberList().add(1475888);
        map.putIfAbsent(1,newCar0);

        if (map.containsKey(1)){
            Car existingCar = map.get(1);
            existingCar.getNameList().add("car1");
            existingCar.getNumberList().add(1234);
        } else{
            Car newCar = new Car();
            newCar.getNameList().add("new car");
            newCar.getNumberList().add(147);
            map.putIfAbsent(1,newCar);
        }
       for(Map.Entry<Integer,Car> item : map.entrySet()){
           System.out.printf("Key: %s  Value: %s %s \n", item.getKey(), item.getValue().getNameList(), item.getValue().getNumberList());
       }


    }
}