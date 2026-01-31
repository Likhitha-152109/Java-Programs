import java.util.Scanner;
public class PrimeNum
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
		if(n<=1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n+" is a prime number");
			}
			else
			{
				System.out.println(n+" is not a prime number");
			}
		}
	}
}