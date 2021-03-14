import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args) 
    {
        int t1 = 0, t2 = 1;
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The Fibonacci series is : ");
        for (int i = 1; i <= num; ++i)
        {
            System.out.println(i+") "+t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        s.close();
    }
}