import java.util.Scanner;
public class ArrayChallenges 
{
static boolean moreSweets;
	public static void main(String[] args)
	{
	moreSweets = true;
	challenge1();
	challenge2();
	challenge3();

	}

	private static void challenge1() 
	{
	String [] sweets;
	Scanner userInput = new Scanner(System.in);
	System.out.println("How many different sweets do you have?");
	int numberOfSweets = userInput.nextInt();
	sweets = new String [numberOfSweets];
	for (int i = 0; i < numberOfSweets; i++)
		{
		System.out.println("Tell me the name of a sweet you like.");
		String sweetName = userInput.nextLine();
		}
	}

	private static void challenge2() 
	{
		
		
	}

	private static void challenge3() 
	{
		
		
	}

}
