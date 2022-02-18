package com.company;

import java.util.Scanner;

public class Main {
    static int first(int[] arr,int n){
        int a=0;
        for (int i=0;i<n;i++){
            int flag=n;
            for(int j=0;j<n;j++){
                if(i!=j) {
                    if (arr[i] == arr[j]) {
                        flag =0;
                        break;
                    }
                    else
                        flag--;
                }
            }
            if(flag==1){
                a =arr[i];
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number of elements in the array");
        num= sc.nextInt();
        int [] arr= new int[num];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int result=first(arr,num);
        System.out.println("First non-repeated number in the array is :: "+result);

    }
}
