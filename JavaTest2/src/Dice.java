
public class Dice {
	private int mDiceNumber;
	private String mid;
	
	//Create a constructor to get player select number of dice to throw
	public Dice(int lo, int hi, int midRng)
	{
		mDiceNumber = (lo + (int)(Math.random()*hi));
		mid = Integer.toString(midRng);
	}
	
	public int GetDice()
	{
		return mDiceNumber;
	}
	
	//Get the point from Dice one
	public String DiceOnePoint(String answer, int diceNum)
	{
		int pPoint = 0;
		//switch to get player answer low/high or middle
		switch(answer.toLowerCase())
		{
		case "low":	
			switch(diceNum)
			{
			case 1: case 2: case 3: 
				System.out.println("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			case 4: case 5: case 6: 
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			}
			break;
		case "high":
			switch(diceNum)
			{
			case 1: case 2: case 3: 
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 4: case 5: case 6: 
				System.out.println("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			}
			break;
		case "mid":
			switch(diceNum)
			{
			case 1: case 2: case 3: 
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 5: case 6: 
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 4: 
				System.out.println("Congrat, you get 5 points!!!");
				pPoint = pPoint + 5;
				break;
			}
			break;
		}
		System.out.println("Your point is " + pPoint);	
		
		return mid;
	}
	
	//get point from dice number 2
	public String DiceTwoPoint(String answer, int diceNum)
	{
		int pPoint = 0;
		switch(answer.toLowerCase())
		{
		case "low":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5:
				System.out.print("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			case 6: case 7: case 8: case 9: case 10: case 11: case 12:
				System.out.print("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			}
			break;
		case "high":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5: case 6:
				System.out.print("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 7: case 8: case 9: case 10: case 11: case 12:
				System.out.print("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			}
			break;
		case "mid":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5: 
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 7: case 8: case 9: case 10: case 11: case 12:
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 6:
				System.out.println("Congrat, you get 5 points!!!");
				pPoint = pPoint + 5;
				break;
			}
			break;
		}
		System.out.println("Your point is " + pPoint);	
		return mid;
	}
	
	
	//Get point from Dice number 3
	public String DiceThreePoint(String answer, int diceNum)
	{
		int pPoint = 0;
		switch(answer.toLowerCase())
		{
		case "low":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
				System.out.println("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18:
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			}
			break;
		case "high":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				System.out.println("Correct, you will be added 1 point!");
				pPoint = pPoint - 1;
				break;
			case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18:
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			}
			break;
		case "mid":
			switch(diceNum)
			{
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
				System.out.println("Correct, you will be added 1 point!");
				pPoint = pPoint + 1;
				break;
			case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18:
				System.out.println("Wrong, you will be deducted 1 point");
				pPoint = pPoint - 1;
				break;
			case 9:
				System.out.println("Congrat, you get 5 points!!!");
				pPoint = pPoint + 5;
				break;
			}
			break;
		}
		System.out.println("Your point is " + pPoint);
		return mid;
	
	}
}
