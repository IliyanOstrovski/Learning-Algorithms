package com.company.Recursion;

public class EvenOddArray {
    public static void main(String[] args) {
        String[] names = {"Peter", "Toni", "John", "Donald", "Jack", "Joseph"};
        printElements(0, names);
    }

    static void printElements(int index, String[] arr){
        if (index == arr.length){
            return;
        }
        String result = index % 2 == 0 ? "Even-" : "Odd-";
        System.out.println(result + arr[index]);
        printElements(index + 1, arr);
    }
}
