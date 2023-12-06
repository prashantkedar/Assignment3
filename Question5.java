//Input 3 numbers and find the largest.
//Input: 7, 3, 5
//Output: 7

//Condition : Your program cannot have more than 2 comparisons.


import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 1 number = ");
        int a = sc. nextInt();
	System.out.print("Enter 2 number = ");
        int b = sc. nextInt();
	System.out.print("Enter 3 number = ");
        int c = sc. nextInt();
	
	int largest = (a > b ? a : b);
	largest = (largest > c ? largest : c);

	System.out.println("Largest No :" + largest);

	
	
    }
}