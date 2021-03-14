import java.util.Scanner;

public class each_char
{
	public static void main(String[] args) 
	{
		String str = ""; 
		int up=0,low=0,space=0,num=0,special=0;
		Scanner in = new Scanner(System.in);   
		System.out.println("Enter a string");  
		str = in.nextLine();  
		in.close();
		int length = str.length();   
		for ( int i =0; i<length; i++ )  
		{
			char ch =str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') 
				up++; 
			else if (ch >= 'a' && ch <= 'z') 
				low++; 
			else if (ch >= '0' && ch <= '9') 
				num++; 
			else if(ch==' ' )
				space++;
			else
				special++; 
		} 
		System.out.println("Lower case letters : " + low); 
		System.out.println("Upper case letters : " + up); 
		System.out.println("space : " + space); 
		System.out.println("digits : " + num); 
		System.out.println("Special characters : " + special); 
	} 
}