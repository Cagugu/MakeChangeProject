package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
	
	double itemCost = 0;
	double custCash = 0;
	double custChange = 0;
	
	
		
	// use scanner for input cost ( of item/s purchased) and cash(money from cust)
	System.out.println("Thank you for shopping! "
			+ "Please enter the total cost of your items: ");
	itemCost = keyboard.nextDouble();
	
	System.out.println("Please enter the amount of cash you'll be paying with: ");
	custCash = keyboard.nextDouble();
	
	custChange = custCash - itemCost;
	
//	System.out.println("Item cost: " + itemCost + " Customer cash: " + custCash);
	if (custCash < itemCost) { 
		System.out.println("Please provide more cash than the cost of your item.");
	}
	else if (custCash == itemCost) {
		System.out.println("You paid in exact change. Have a good day!");
	}
		//take user input and calc change using cash - cost
	else  {  //25.56
		
		System.out.print("Your change is: ");
		
		 if (custChange > 20) {
			 double changeTwenty = (custChange / 20); 
			 System.out.print((int)changeTwenty + ": 20 dollar bill/s, ");
//			System.out.println(changeTwenty);
			custChange %= 20;
		}
		 if (custChange > 10) {
			 double changeTen = (custChange /10);
			System.out.print((int)changeTen + ": 10 dollar bill, ");
			custChange %= 10;
		}
		 if (custChange > 5) {
			double changeFive = (custChange / 5);
			System.out.print((int)changeFive + ": 5 dollar bill, " );
			custChange %= 5;
		}
		 if (custChange > 1) {
			double changeOne = (custChange / 1);
			System.out.print((int)changeOne + ": 1 dollar bill/s, " );
			custChange %= 1;
			
		}
		 if (custChange > .25) {
			double changeQuarters = (custChange /.25);
			System.out.print((int)changeQuarters + ": quarter/s, ");
			custChange %= .25;
		 }
		if (custChange > .10) {
			double changeDimes = (custChange / .10);
			System.out.print((int)changeDimes + ": dime/s, ");
			custChange %= .10;
			System.out.println(custChange);
		}
		if (custChange >= .05) {
			double changeNickle = (custChange / .05);
			System.out.print((int)changeNickle + ": nickle, ");
			custChange %= .5;
			System.out.println(custChange);
		}
		if (custChange > .01) {
			double changePennies = (custChange / .01);
			System.out.print((int)changePennies + ": pennies.");
		}
			
		
		}
	}
	}


// while / if/ to drop through change values  based on input 

// error statement for too little or exact amount of cash

//ex print: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.

// print out change values as 
