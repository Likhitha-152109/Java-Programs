import java.util.Scanner;
public class StrongNumber
{
	public static void main(String[] args)
	{
		int n,temp,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		temp=n;
		while(temp!=0)
		{
			int r=temp%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==n)
		{
			System.out.println(n+" is a Strong number");
		}
		else
		{
			System.out.println(n+" is not a Strong number");
		}
	}
}