package com.example.demo.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
     List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        ArrayList<Integer> reduce = list.stream().reduce(new ArrayList<Integer>(), (a, b) -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                }
                ,
                (a, b) -> {
                    a.addAll(b);
                    return a;
                });

        System.out.println(reduce);
    }
}
