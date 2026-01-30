import java.util.*;
public class PositiveNegative
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}