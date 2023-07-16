//Marques Johnson

import java.util.Scanner;
import java.util.Random;
public class MathChallenge {
	public static final int RANDOM_RANGE = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Are you ready for a math problem? \"yes\" or \"no\"");
		String play = keyboard.nextLine();
		keyboard.nextLine();
		
		if(play.equals("yes"))
		{
			System.out.println("Yay!");
		}
		else
		{
			System.out.println("Aw boo");
			System.exit(0);//Stops the program
		}
		int num1 = r.nextInt(RANDOM_RANGE);
		int num2 = r.nextInt(RANDOM_RANGE);
		int sum = num1 + num2;
		System.out.println("What is "+num1+" + "+ num2);
		int answer = keyboard.nextInt();
		if(sum == answer)
		{
			System.out.println("You are Right");
			
		} 
		else 
		{
			System.out.println("Wrong");
		}
		
	}
}