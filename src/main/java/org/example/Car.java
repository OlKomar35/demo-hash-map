package org.example;


import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Car {
    List<String> nameList = Collections.emptyList();
    List<Integer> numberList= Collections.emptyList();

    public List<String> getNameList() {
        nameList = new ArrayList<>(nameList);
        return nameList;
    }

    public Car() {

    }

    public Car(List<String> nameList, List<Integer> numberList) {
        this.nameList = nameList;
        this.numberList = numberList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public List<Integer> getNumberList() {
        numberList = new ArrayList<>(numberList);
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }
}
