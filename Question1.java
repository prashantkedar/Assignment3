//1. Write a program to convert MilliSec To Hrs,Mins,Secs
//Given the time in milliseconds, express in the form of Hours: Minute: Seconds
//Input: 7000234
//Output: 1: 56: 40
//Hint: 1000 milliseconds make 1 second
//60 Seconds makes 1 minute
//60 minutes make 1 hour


import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input : ");
        int mili = sc.nextInt();

	
	int a = (mili/1000);
	
	int s = a%60;
	int b = a/60;
	int m = b%60;
	int h = (mili/(1000*60*60));

	System.out.printf("output: %d : %d : %d " , h , m , s);
	




    }
}