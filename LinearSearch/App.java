package com.company.LinearSearch;

public class App {
    public static void main(String[] args) {
        int array[] = {9,1,8,2,7,3,6,4,5};
        int index = linearSearch(array, 2);
        if(index!= -1){
            System.out.println("Element found at index " + index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] a, int x){

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x){
                return i;
            }
        }
        return -1;
    }
}
