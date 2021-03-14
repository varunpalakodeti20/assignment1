import java.util.Scanner;
public class range_strong
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Number, minimum, maximum, Temp, Sum = 0;
		sc = new Scanner(System.in);
		System.out.print("Please Enter the Minimum value : ");
		minimum = sc.nextInt();			
		System.out.print("Please Enter the Maximum value : ");
		maximum = sc.nextInt();	
		for(Number = minimum; Number <= maximum; Number++)
		{
			Temp = Number; 
			Sum = StrongNumber(Temp);
			if (Number == Sum )
			{
				System.out.println(Number + " is a Strong Number");
			}
		}
	}
	public static int Factorial(int num)
	{
		if (num == 0 || num == 1)
			return 1;
		else
		    return num * Factorial (num -1);
	}
	public static int StrongNumber(int num)
	{
		int Temp, Reminder, Sum = 0, Factorial;
		
		for(Temp = num; Temp > 0; Temp = Temp /10)
		{
			Factorial = 1; 			
			Reminder = Temp % 10;
			Factorial = Factorial(Reminder);
			Sum = Sum + Factorial;
		}
		return Sum;
	}
}