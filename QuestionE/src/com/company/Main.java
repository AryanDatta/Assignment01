package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static boolean anagram(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
        char[] st1=str1.toCharArray();
        char[] st2=str2.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        int n=str1.length();
        for(int i=0; i<n ;i++){
            if (st1[i] != st2[i])
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Type in the strings to find if they are anagram or not");
        Scanner sc= new Scanner(System.in);
        String str0= sc.nextLine();
        String str1=str0.toLowerCase(Locale.ROOT);
        String str2= sc.nextLine();
        String str3=str0.toLowerCase(Locale.ROOT);
        if(anagram(str1,str3)){
            System.out.println("The given strings are anagram");
        }
        else
            System.out.println("Not in anagram");
    }
}
