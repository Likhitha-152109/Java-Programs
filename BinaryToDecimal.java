import java.util.Scanner;
public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		int binary,temp,decimal=0,power=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a binary number:");
		binary=s.nextInt();
		temp=binary;
		while(temp!=0)
		{
			int digit=temp%10;
			if(digit!=0 && digit!=1)
			{
				System.out.println("The given number is not a binary number");
				return;
			}
			temp/=10;
		}
		while(binary!=0)
		{
			int digit=binary%10;
			decimal+=digit*Math.pow(2,power);
			power++;
			binary/=10;
		}
		System.out.println("Decimal value:"+decimal);
	}
}