//Write a program to swap both halfs of a 4 digit number.
//Input a 4-digit number. Interchange the first half with the second half.
//Input: 4523
//Output : 2345


import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input : ");
        int a = sc.nextInt();

	int b = a%100;
	int c = a/100;
	
	System.out.println((b*100)+c);




    }
}