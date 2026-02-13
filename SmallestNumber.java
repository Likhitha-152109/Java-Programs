import java.util.*;
class SmallestNumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many numbers?");
		int n=s.nextInt();
		int min=Integer.MAX_VALUE;
		System.out.println("Enter numbers:");
		for(int i=1;i<=n;i++)
		{
			int num=s.nextInt();
			if(num<min)
			{
				min=num;
			}
		}
		System.out.println("Smallest number:"+min);
	}
}