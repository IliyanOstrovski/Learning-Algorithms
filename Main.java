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

        System.out.println(sumMN(3 ,3));
    }

   public static long sumMN (int n , int m){
        long sum = 0;
        for (int x = 0; x <n ; x++) {
            for (int y = 0; y <m; y++) {
                if (x==y){
                    for (int i = 0; i <n; i++) {
                        sum+=i*x*y;
                    }
                }
            }
        }
        return sum;
    }
 }



