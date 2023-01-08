package com.bridgelabz.forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Palindrome number : ");
        int rev = 0,r;
        int num = sc.nextInt();
        // store the number to originalNum
        int originalNum = num;
        for (;num != 0;num = num / 10)
        {
            r = num % 10;
            rev = rev * 10 + r;
        }
        if (originalNum == rev)
        {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not an Palindrome");
        }
        //System.out.println(rev);
    }
}
