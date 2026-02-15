import java.util.Scanner;
class RecursionGCD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		int result=gcd(a,b);
		System.out.println("GCD/HCF="+result);
	}
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	}
}