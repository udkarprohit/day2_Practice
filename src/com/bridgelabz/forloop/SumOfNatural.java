package com.bridgelabz.forloop;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        int num = 0,sum = 0;
        num = sc.nextInt();
        for (int i = 1;i<=num;i++)
        {
            sum = sum + i;
        }
        System.out.println("The Sum Of N natural number : " + sum);

    }
}
