import java.util.Scanner;
public class d2h
{    
	public static String toHex(int decimal)
	{    
		int rem;  
		String hex="";   
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
		while(decimal>0)  
		{  
			rem=decimal%16;   
			hex=hexchars[rem]+hex;   
			decimal=decimal/16;  
		}  
		return hex;  
	}    
	public static void main(String args[])
	{      
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int num = s.nextInt();
		s.close();
		System.out.println("Decimal to HexaDecimal of "+num+" is: "+toHex(num));
	}
}