import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		int n,rev=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println("The number is Palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
}