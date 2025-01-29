package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the starting amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		double money = startAmount;
		
		int count =0 ;
		
		while(!(money <= 0 || money >= winLimit)) {
			if (Math.random()<winChance) {
				money++;
				//System.out.println("Win: " + money);
				count++;
			}
			else {
				money--;
				//System.out.println("Loss: " + money);
				count++;
			}
		}
		System.out.println(count);
		
		if(money==0.0) {
			System.out.println("Ruin");
		}
		else {
			System.out.println("Success");
		}
	}

}
