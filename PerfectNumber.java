import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n && n!=0)
		{
			System.out.println(n+" is a Perfect number");
		}
		else
		{
			System.out.println(n+" is not a Perfect number");
		}
	}
}