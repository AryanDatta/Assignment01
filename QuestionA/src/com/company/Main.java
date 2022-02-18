package com.company;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String CouFre(String str){
        int n=str.length();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        int[] frq=new int[256];
        //counting the frequency of repeated characters
        for(int i=0;i<n;i++){
            frq[str.charAt(i)]++;
        }
        //adding only valuable information to array list
        for(int i=0,j=0;i<256;i++){
            if(frq[i]!=0){
                arr1.add(frq[i]);
                j++;
            }
        }
        //changing arraylist back to string
        String result=Arrays.toString(new ArrayList[]{arr1});
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the desired string");
        //taking input
        String str=sc.nextLine();
        String res=CouFre(str);
        String newStr= "";
        //removing repeated characters from string
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(newStr.indexOf(a)<0){
                newStr +=a;
            }
        }
        //making output readable
        int  l=newStr.length();
        char[] ch=newStr.toCharArray();
        Arrays.sort(ch);
        System.out.println("Frequency will be");
        System.out.println(Arrays.toString(ch));
        System.out.println(res);
    }
}