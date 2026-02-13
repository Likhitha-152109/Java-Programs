import java.util.*;
class LargestNumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many numbers?");
		int n=s.nextInt();
		int max=Integer.MIN_VALUE;
		System.out.println("Enter numbers:");
		for(int i=1;i<=n;i++)
		{
			int num=s.nextInt();
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println("Largest number="+max);
	}
}
