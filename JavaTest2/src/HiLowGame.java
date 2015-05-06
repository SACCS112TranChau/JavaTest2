import java.util.Scanner;

public class HiLowGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pAgain = "N";	
		
		Scanner in = new Scanner(System.in);
		
		do
		{
			//prompt user to enter the dice to throw
			//1. player to select the number of dice to throw
			System.out.println("There are 3 dice game, how many game you want to play. "
					+ "/n Enter 1, 2 or 3");
			int diceNumber = in.nextInt();
	
			//2. System will generate a random number representing the total of the dices
			// and the low-high=mid ranges
			Dice oneDice = new Dice(1,6,4);
			Dice twoDice = new Dice(1,12,6);
			Dice threeDice = new Dice(1,18,9);	
			
			//prompt player to enter high/low or middle
			System.out.print("Please enter high/low or middle to play: ");
			String pAnswer = in.next();
			
			//System.out.println("Dice 1: " + oneDice.GetDice());
			switch(diceNumber)
			{
			//call appropriate methods to get the user answer and piont
			case 1:
				System.out.println("Dice number 1 is: " + oneDice.GetDice());				
				oneDice.DiceOnePoint(pAnswer, oneDice.GetDice());				
				break;
			case 2:
				System.out.println("Dice number 2 is: " + twoDice.GetDice());
				twoDice.DiceTwoPoint(pAnswer, twoDice.GetDice());
				break;
			case 3:
				System.out.println("Dice number 3 is: " + threeDice.GetDice());
				threeDice.DiceThreePoint(pAnswer, threeDice.GetDice());
				break;
			}
			System.out.print("Do you want to play again: ");
			pAgain = in.next();
		}while(pAgain.equalsIgnoreCase("Y"));
		System.out.println("Thanks for playing!!!");
		in.close();

	}

}
