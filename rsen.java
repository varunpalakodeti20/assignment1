import java.util.Scanner;
public class rsen
{
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
	    System.out.println("Enter sentence= ");
	    String s1 = sn.nextLine();
	    sn.close();
	    s1=s1.trim(); 
	    s1=s1+" ";
	    int len=s1.length();
	    int i, p=0;
	    String s2= " ";
	    for(i=0; i<=len-1; i++)
	    {
	    	if(s1.charAt(i)==' ')
	    	{
	    		s2=s1.substring(p,i)+" "+s2; 
	    		p=i+1;
	    	}
	    }
	    System.out.println("Reversed String : \n"+s2);
	}
}