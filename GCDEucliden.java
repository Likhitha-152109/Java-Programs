import  java.util.Scanner;
public class GCDEucliden
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter second number:");
		int b=s.nextInt();
		while(b!=0)
		{
			int temp=a;
			b=a%b;
			a=temp;
		}
		System.out.println("GCD/HCF="+b);
	}
}