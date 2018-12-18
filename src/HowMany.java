/**
 * 
 * @author Akul Patel
 * How Many
 *
 */
import java.util.Random; 
import java.util.Scanner; 

public class HowMany 
{

	public static void main(String[] args) 
	{
		Random rand = new Random(); 
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("How many times should the die be rolled: ");
		int times = scan.nextInt();
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		
		for(int i = 1; i <= times; i++)
		{
			int die = rand.nextInt(6) + 1; 
			System.out.println("You rolled: " + die);
			switch(die)
			{
				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
			}
			
		}
		
		System.out.printf("\nYou rolled:\nOne: %3d time(s)\nTwo: %3d time(s)\nThree: %d time(s)" +
				"\nFour: %2d time(s)\nFive: %2d time(s)\nSix: %3d time(s)", one, two, three, four, five, six);
		
	}

}
