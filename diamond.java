import java.util.Scanner;
public class diamond 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		s.close();
	    for (int i = 1; i <= n; i++)
	    {
	        for (int j = 1; j <= n - i; j++)
	        	System.out.print(" ");
	        for (int k = i; k >= 1; k--)
	        	System.out.print(k);
	        for (int l = 2; l <= i; l++)
	        	System.out.print(l);
	        System.out.println();
	    }
	    for (int i = (n-1); i >= 1; i--)
        {
            for (int j = 0; j <= (n-1) - i; j++)
            	System.out.print(" ");
            for (int k = i; k >= 1; k--)
            	System.out.print(k);
            for (int l = 2; l <= i; l++)
            	System.out.print(l);
            System.out.println();
        }
	}
}