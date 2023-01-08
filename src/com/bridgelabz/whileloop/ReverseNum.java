package com.bridgelabz.whileloop;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rev = 0,r;
        while (num != 0)
        {
            r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
