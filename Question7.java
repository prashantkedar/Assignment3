//The military uses a 4-digit number system for communicating the time of day.For example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is
//11:50pm. Write a program to input the 4-digit time and convert it to 12-hour format.
//Eg: 2350 >>> 11:50pm

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 4 digit time = ");
        int a = sc. nextInt();
	String str;
	int b = a/100;
	int c = a%100;
	
	if (b >12 && b <= 24) {

        str = "pm";
    } else {
        str = "am";
    }
        int d = b/2;

	System.out.println( + a + " >>> " + d + ":" + c + str);
	

	
    }

}