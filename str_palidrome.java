import java.util.Scanner;
public class str_palidrome
{
	public static void main(String[] args)
	{
		String a, reverse = "";  
		Scanner s = new Scanner(System.in);   
		System.out.println("Enter a string: ");  
		a= s.nextLine(); 
		s.close();
		int l = a.length();   
		for ( int i =l-1; i>=0; i-- )  
			reverse = reverse + a.charAt(i);  
		if (a.equals(reverse))  
			System.out.println("Entered string is a palindrome.");  
		else  
			System.out.println("Entered string isn't a palindrome.");   
	}  
}