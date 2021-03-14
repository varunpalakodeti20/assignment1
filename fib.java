import java.util.Scanner;
public class fib 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		s.close();
		int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
        	int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println(t1);
    }
}