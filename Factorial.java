import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			fact*=i;	
		}
		System.out.println("Factorial of the given number:"+fact);
	}
}