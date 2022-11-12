package com.company.RemoveElement;

public class App {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        printArray(arr);
        swapElements(arr, 2, 5);
        printArray(arr);
    }
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    static void swapElements(int arr[], int i , int j){
        if (i < 0 || i > arr.length)
            return;
        if (j < 0 || j > arr.length)
            return;

        int temp = arr[i];;
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
