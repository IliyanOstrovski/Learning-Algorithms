package com.company;

import java.util.Arrays;
import java.util.List;

public  class Main{
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5,4,3,2,1);
    list.stream().map(x -> x * 2)
            .filter((n) -> n<5)
            .forEach(System.out::print);

    }
}


