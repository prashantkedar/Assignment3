//Input a 3 digit number and find whether the given number is an “Armstrong Number”
//Definition of an Armstrong Number: Cubic sum of its digit is equal to the number
//itself.
//Input: 153
//Output : 153 is an Armstrong Number
//Input: 150
//Output: 150 is not an Armstrong

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 3 digit number = ");
        int a = sc. nextInt();
	
	int b = a%10;
	int c = a/10;
	int d = c%10;
	int e = a/100;

	int p = ((e*e*e)+(d*d*d)+(b*b*b));
	
	if (p==a) {
	System.out.println(a + "  is an asrmstrong Number");
    }else {
	System.out.println(a + "  is not an asrmstrong Number");
    }

	
    }

}