package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().mapToDouble(Integer::doubleValue).reduce(0,Double::sum) / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, Integer::max);
    }

    public int getLastOdd() {
        List<Integer> oddFilteredList = arrayList.stream().filter(number -> number%2==1).collect(Collectors.toList());
        return oddFilteredList.get(oddFilteredList.size()-1);
    }
}