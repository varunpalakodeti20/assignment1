import java.util.Scanner;
public class d2b
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Decimal num:");
		int num = s.nextInt();
		System.out.println("Binary of " + num + " is " + DecToBin(num));
		s.close();
	}
	public static long DecToBin(int n) 
	{
		long binNum = 0;
		int rem, b = 1;
		while (n>0) 
		{
			rem = n % 2;
			n = n/2;
			binNum = binNum + rem * b;
			b = b*10;
		}
		return binNum;
	}
}