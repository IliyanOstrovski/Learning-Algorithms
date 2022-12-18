package com.company.countEvens;


import java.sql.Array;

public class CountEvens {
    public static void main(String[] args) {
        int[] elements = new int[]{1,2,3,4,5,6,7};
        countEvens(elements);
    }
    public static int countEvens(int elements[]){
        int count =0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] %2==0){
                count++;
            }
        }
        return count;
    }
}
