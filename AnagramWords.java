package com.company;
public class AnagramWords {
    private static int CHARACTER_RANGE= 256;
    public static void main(String[] args) {
        if (isAnagram("gram", "ramg")){
            System.out.println("The words are anagrams.");
        }
        else{
            System.out.println("The words are not anagrams.");
        }

    }
    public static boolean isAnagram (String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < firstWord.length(); i++) {
            count[firstWord.charAt(i)]++;
            count[secondWord.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

