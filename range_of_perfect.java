import java.util.Scanner;
public class range_of_perfect 
{
	public static void main(String args[])
    {
		int num, i, sum=0, total=0;
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a lower bound value");
	    int lb = s.nextInt();
	    System.out.println("Enter an upper bound value");
	    int ub = s.nextInt();
        System.out.println("PERFECT NUMBERS : ");
        for(num = lb; num <= ub; num++)  
        {
          sum=0;
          for(i=1; i<=num; i++)
          {
            if(num%i==0)
                sum=sum+i;
          }
          if(num*2==sum)
          {
            System.out.println(num);
            sum=0;
            total++;
          }
       }
       System.out.println("Total : "+total);
       s.close();
    }
}
