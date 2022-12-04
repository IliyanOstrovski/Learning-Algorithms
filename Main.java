package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public  class Main{
/*
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5,4,3,2,1);
    list.stream().map(x -> x * 2)
            .filter((n) -> n<5)
            .forEach(System.out::print);
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int area = a * a;
        System.out.println(area);
    }
 }



