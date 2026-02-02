import java.util.Scanner;
public class ArmStrongNumber
    {
		public static void main(String[] args)
		{
			int n,temp,sum=0,digits=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number:");
			n=s.nextInt();
			temp=n;
			while(temp!=0)
			{
				digits++;
				temp/=10;
			}
			temp=n;
			while(temp!=0)
			{
				int r=temp%10;
				sum+=Math.pow(r,digits);
				temp/=10;
			}
			if(sum==n)
			{
				System.out.println(n+" is a Armstrong number");
			}
			else
			{
				System.out.println(n+" is not a Armstrong number");
			}
		}
	}
			
			