import java.util.Scanner;
public class b2d
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter binary num:");
		int num = s.nextInt();
		System.out.println("Deciaml of " + num + " is " + BinToDec(num));
		s.close();
	}
	public static long BinToDec(int n) 
	{
		long decNum = 0;
		int rem, b = 1;
		while (n>0) 
		{
			rem = n % 10;
			n = n/10;
			decNum = decNum + rem * b;
			b = b*2;
		}
		return decNum;
	}
}