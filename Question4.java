//Bluebird bus service operates a bus only when its entire 50 seats are occupied. X number of bookings have been made for the day. Write a program to
//find the number of people from X who will get to travel today.
//Input : X= 109
//Output : People Travelling = 100
//Hint : No.of passengers travelling = 50 * (x/50)


import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input x = ");
        int x = sc. nextInt();

	System.out.println("People travelling = " + 50*(x/50));

	
	
    }
}