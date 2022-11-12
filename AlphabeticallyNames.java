package com.company;

import java.util.Arrays;

public class AlphabeticallyNames {

    public static void main(String[] args)
    {
        // storing input in variable
        int n = 4;
        // create string array called names
        String names[]
                = { "Rahul", "Ajay", "Gourav", "Riya" };
        // inbuilt sort function
        Arrays.sort(names);
        // print output array
        System.out.println(
                "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
//    public static void main(String[] args)
//    {
//        // storing input in variable
//        int n = 4;
//
//        // create string array called names
//        String names[] = { "Rahul", "Ajay", "Gourav", "Riya" };
//        String temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//
//                // to compare one string with other strings
//                if (names[i].compareTo(names[j]) > 0) {
//                    // swapping
//                    temp = names[i];
//                    names[i] = names[j];
//                    names[j] = temp;
//                }
//            }
//        }
//
//        // print output array
//        System.out.println(
//                "The names in alphabetical order are: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(names[i]);
//        }
//    }
}
