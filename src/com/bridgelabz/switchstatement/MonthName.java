package com.bridgelabz.switchstatement;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String month = "";
        int num = sc.nextInt();
        int n = num;
        if (num != 0)
        {
            switch (num){
                case 1:
                    month = "January" + month;
                    break;
                case 2:
                    month = "February" + month;
                    break;
                case 3:
                    month = "March" + month;
                    break;
                case 4:
                    month = "April" + month;
                    break;
                case 5:
                    month = "May" + month;
                    break;
                case 6:
                    month = "June" + month;
                    break;
                case 7:
                    month = "July" + month;
                    break;
                case 8:
                    month = "August" + month;
                    break;
                case 9:
                    month = "September" + month;
                    break;
                case 10:
                    month = "October" + month;
                    break;
                case 11:
                    month = "November" + month;
                    break;
                case 12:
                    month = "December" + month;
                    break;
                default:
                    System.out.println("Not an month");
            }
        }
        System.out.println(n + " " + "Month is " + month);
    }
}
