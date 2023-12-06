//Input the name and numbers of units consumed by the consumer.Calculate the electricity bill.
//For the first 100 units charge Rs. 4 per units
//For the next 200 units charge Rs. 5.
//For every additional unit above 300 units, charge Rs 10.
//If the amount exceeds Rs. 1000 charge 5 % additional surcharge.
//All the amounts are charged 18% GST.
//Print the name , unit consumed and the amount to be paid.
//Example:

//Input: Name : Arjun
//Unit:310
//Output :Name:Arjun
//Units : 310
//Amount : 1858.5

//Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 ( 10 units) + 75(5% surcharge) + 283.5 (GST)= 1858.5 (Total) amount

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Name of cnsumer = ");
        String name = sc. next();
	System.out.print("Enter No. of unit consumed = ");
        int unit = sc. nextInt();

	double amount = 0;
	double gst = 0;

	if (unit <= 100) {

	amount = 100*4;
    }else if (unit >100 && unit <= 300) {

	amount = (100*4)+(200*5);
    }else {
	amount = (100*4)+(200*5)+((unit-300)*10);
    }if (amount >1000.0) {
        amount = (0.05*amount)+amount;
    }

	gst = (0.18*amount);

	System.out.println("name : " +name);
	System.out.println("unit : " +unit);
	System.out.println("Amount : " + (gst+amount));

	
    }

}