//CountCharacter
import java.util.Scanner;
public class countChar
{    
    public static void main(String[] args)
    {    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = s.nextLine();    
        int count = 0;    
        for(int i = 0; i < str.length(); i++)
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("Total number of characters in a string: " + count);    
        s.close();
    }    
}     