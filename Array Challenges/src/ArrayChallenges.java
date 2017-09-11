import java.util.Scanner;

public class ArrayChallenges 
{
static int evenSum, oddSum;
	public static void main(String[] args)
	{
		
	//challenge1();
	//challenge2();
	challenge3();

	}

	private static void challenge1() 
	{
	String [] sweets;
	Scanner userSweet = new Scanner(System.in);
	Scanner userInput = new Scanner(System.in);
	System.out.println("How many different sweets do you have?");
	sweets = new String [userSweet.nextInt()];
	for (int i = 0; i < sweets.length; i++)
		{
		System.out.println("Tell me the name of a sweet you like.");
		String sweetName = userInput.nextLine();
		sweets [i] = sweetName;
		}
	System.out.print("Oh wow, I also like ");
	for (int i = 0; i < sweets.length; i++)
		{
		if (i == sweets.length - 1)
			{
			System.out.print("and " + sweets[i] + "!");
			}
		else
			{
			System.out.print(sweets [i] + ", ");
			}
		}
	}

	private static void challenge2() 
	{
	int [] octaveArray = new int [8];
	Scanner userNumber = new Scanner(System.in);
	System.out.println("Please give me 8 numbers.");
	for (int i = 0; i < octaveArray.length; i++)
		{
		octaveArray [i] = userNumber.nextInt();
		if (octaveArray [i] % 2 == 0)
			{
			evenSum += octaveArray [i];
			}	
		else
			{
			oddSum += octaveArray [i];
			}
		}
	System.out.println("The sum of the even numbers in this array is " + evenSum + ", and the sum of the odd numbers in this array is " + oddSum + ".");
	}

	private static void challenge3() 
	{
	
		
	}

}
