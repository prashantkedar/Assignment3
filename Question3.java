//Given the days express in the form of Years: Months: Weeks: Days
//Input : 1020 days
//Output: 2 Years : 9 Months: 2 Weeks : 6 Days
//Hint : 365 days make a year, 30 days make a month , 7 days make a week


import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input no. days : ");
        int days = sc. nextInt();

	int year = days/365;
	int a = days%365;
	int month = a/30;
	int c = a%30;
	int week = c/7;
	int d = c%7;

	System.out.println("output : year:" + year + " month:" + month + " week:" + week + " days:" + d);
	
    }
}