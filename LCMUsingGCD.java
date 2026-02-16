import java.util.Scanner;
class LCMUsingGCD
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		int lcm=a*b/gcd(a,b);
		System.out.println("LCM="+lcm);
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