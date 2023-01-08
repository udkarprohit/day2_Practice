package com.bridgelabz.whileloop;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,sum = 0,n,i = 1;
        System.out.println("Enter the n natural : ");
        num = sc.nextInt();
        while (i <= num){
            sum = sum + i;
            //System.out.print(i + "+ ");
            i++;
        }
        System.out.println("Sum of n natural is : " + sum);
    }
}
