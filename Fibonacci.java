import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		int n,c,a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers in the sreies you want:");
		n=s.nextInt();
		System.out.println("Fibonacci series:");
		for(int i=1;i<=n;i++)
		{
		System.out.println(a+"");
		c=a+b;
		a=b;
		b=c;
		}
		
	}
}