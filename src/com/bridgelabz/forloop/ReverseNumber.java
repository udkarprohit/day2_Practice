package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reverse number : ");
        int rev = 0,r;
        int num = sc.nextInt();
        for (;num != 0;num = num / 10)
        {
            r = num % 10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);
    }
}
