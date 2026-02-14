import java.util.Scanner;
class GCD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		int gcd=1;
		for(int i=0;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD/HCF:"+gcd);
	}
}