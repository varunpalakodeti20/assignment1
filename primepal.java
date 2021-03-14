import java.util.Scanner;
public class primepal
{
	public static int checkPrime(int n)
	{  
		int i,m=0,flag=0;      
		m=n/2;
		if(n==0||n==1)
			return 0;
		else
		{  
			for(i=2;i<=m;i++)
			{      
				if(n%i==0)
				{
					flag = 1;
					return 0;
				}
			}      
			if(flag==0)  
				return 1;  
		} 
		return 0;
	} 
    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	int num = s.nextInt();
    	s.close();
    	int reversedInteger = 0, remainder, originalInteger;
    	originalInteger = num;
    	while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
    	if ((originalInteger == reversedInteger) && (checkPrime(reversedInteger)== 1))
    	{
    		System.out.println(originalInteger + " is a palindrome, also a prime number i.e a prime palindrome");
    	}
    	else
    	{
    		if(checkPrime(reversedInteger)== 1)
    			System.out.println(originalInteger + " is not a palindrome, but a prime number");
    		else
    			System.out.println(originalInteger + " is not a palindrome, also not a prime number");
    	}
    }
}