import java.util.Scanner;
public class o2d
{
	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter octal num:");
		int num = s.nextInt();
		s.close();
		System.out.println("Deciaml of " + num + " is " + OctToDec(num));
    }
	public static long OctToDec(int n) 
	{
		long decNum = 0;
		int rem, b = 1;
		while (n>0) 
		{
			rem = n % 10;
			n = n/10;
			decNum = decNum + rem * b;
			b = b*8;
		}
		return decNum;
	}
}