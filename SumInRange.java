import java.util.*;
public class SumInRange
{
	public static void main(String[] args)
	{
		int start,end,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number:");
		start=s.nextInt();
		System.out.println("Enter ending number:");
		end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of digits in the range of "+start+" to "+end+" is:"+sum);
	}
}