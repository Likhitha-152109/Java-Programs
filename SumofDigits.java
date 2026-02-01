import java.util.Scanner;
public  class SumofDigits
{
	public static void main(String[] args)
	{
		int n,digit,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("The sum of digits in the number is "+sum);
	}
}
