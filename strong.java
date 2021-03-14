// Program in Java to check if a given number is a strong number or not
import java.util.Scanner;
public class strong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int total = 0;
		int temp = n;
		while(n != 0)
		{
			int fact = 1;
			int ld = n % 10;
			for(int i=1;i<=ld;i++)
			{
				fact = fact * i;
			}
			total = total + fact;
			n = n / 10;
		}
		if(total == temp)
			System.out.println(temp + " is a strong number");
		else
			System.out.println(temp + " is not a strong number");
		sc.close();
	}
}