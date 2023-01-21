package com.company.binarySearch;

public class App {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 3));
    }

    public static int binarySearch(int[] a, int x){
        int start=0;
        int end = a.length-1;

        while (start<=end){
            int mid = (start + end)/2;
            if (x < a[mid]) end = mid-1;
            else if (x > a[mid]) start =mid + 1;
            else return mid;
        }
        return -1;
    }
}
