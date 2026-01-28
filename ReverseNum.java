import java.util.*;
public class ReverseNum
{
	public static void main(String[] args)
	{
		int n,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		System.out.println("Reverse of the number:"+rev);
	}
}