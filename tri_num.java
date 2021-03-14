public class tri_num
{
	public static void main(String []args)
	{
		int n=5, z=1,i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
				System.out.print("");
			for(k=1;k<=z;k++)
				System.out.print(k);
			z=z+1;
			System.out.println("");
        }
    }
}