package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount $");
		int startAmount = in.nextInt();
		System.out.println("win change %");
		double winChance = in.nextDouble();
		System.out.println("How much do you want to leave with? ($)");
		int winLimit = in.nextInt();
		System.out.println("How many days do you want to play for?");
		int days = in.nextInt();
		
		for (int i = 0; i < days; i++) {
			double amount = startAmount;
		while (amount > 0 && amount < winLimit) {
			
			double chance = Math.random();
			
			if(chance <= winChance) {amount++;}
			else {amount--;}
			//System.out.println(amount);
		}
		if (amount==0) {System.out.println("you lose!!!");}
		else {System.out.println("you win!!!");}
		
	}
	}
}
