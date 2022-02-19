package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	double itemCost = 0;
	double custCash = 0;
	int custChange = 0;
	
	
	System.out.println("Thank you for shopping! "
			+ "Please enter the total cost of your items: ");
	itemCost = keyboard.nextDouble();
	itemCost = itemCost * 100;
	
	System.out.println("Please enter the amount of cash you'll be paying with: ");
	custCash = keyboard.nextDouble();
	custCash = custCash * 100;
	
	custChange = (int)(custCash) - (int)(itemCost);
	

	if (custCash < itemCost) { 
		System.out.println("Please provide more cash than the cost of your item.");
	}
	else if (custCash == itemCost) {
		System.out.println("You paid in exact change. Have a good day!");
	}
		
	else  {  //test 1.01 & 25.56 change should be 24.55
		
		System.out.print("Your change is: ");
		
		 if (custChange >= 2000) {
			 double changeTwenty = (custChange / 2000); 
			 System.out.print((int)changeTwenty + ": twenty dollar bill/s, ");			
			custChange %= 2000;
		
		}
		 if (custChange >= 1000) {
			 double changeTen = (custChange /1000);
			System.out.print((int)changeTen + ": ten dollar bill, ");
			custChange %= 1000;
			
		}
		 if (custChange >= 500) {
			double changeFive = (custChange / 500);
			System.out.print((int)changeFive + ": five dollar bill, " );
			custChange %= 500;
			
		}
		 if (custChange >= 100) {
			double changeOne = (custChange / 100);
			System.out.print((int)changeOne + ": one dollar bill/s, " );
			custChange %= 100;
			
		}
		 if (custChange >= 25) {
			double changeQuarters = (custChange /25);
			System.out.print((int)changeQuarters + ": quarter/s, ");
			custChange %= 25;
	
		 }
		if (custChange >= 10) {
			double changeDimes = (custChange / 10);
			System.out.print((int)changeDimes + ": dime/s, ");
			custChange %= 10;
			
		}
		if (custChange >= 5) {
			double changeNickle = (custChange / 5);
			System.out.print((int)changeNickle + ": nickle, ");
			custChange %= 5;
			
		}
		if (custChange >= 1) {
			double changePennies = (custChange / 1);
			System.out.print((int)changePennies + ": pennies.");
			custChange %= 1;
			
		}
			
		}
	}
	}

