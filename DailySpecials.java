package laxmiCSC123Sp21Ass4;
import java.util.Scanner;

public class DailySpecials
{
	enum Days {Sun, Mon, Tue, Wed, Thu, Fri, Sat};
	
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Enter a day\n");
		System.out.print("(Sun, Mon, Tue, Wed, Thur, Fri, Sat) > ");
		String input = keyboard.nextLine();
		Days day = Days.valueOf(input);
		
		switch(day)
		{
			case Sun:
				System.out.printf("Sorry, we’re closed on %s.\n", day);
				break;
			case Mon:
				System.out.printf("The special for %s is Barbeque Chicken.\n", day);
				break;
			case Tue:
				System.out.printf("The special for %s is Lasagna.\n", day);
				break;
			case Wed:
				System.out.printf("The special for %s is Mexican Pasta.\n", day);
				break;
			case Thu:
				System.out.printf("The special for %s is Steak Cobb Salad.\n", day);
				break;
			case Fri:
				System.out.printf("The special for %s is Fish Sticks.\n", day);
				break;
			case Sat:
				System.out.printf("Sorry, we’re closed on %s.\n", day);			
		}
		keyboard.close();
	}
}
