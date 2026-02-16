import java.util.Scanner;
public class LCM
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=s.nextInt();
		System.out.println("Enter Second number:");
		int b=s.nextInt();
		int max=Math.max(a,b);
		int lcm=max;
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				break;
			}
			lcm++;
		}
		System.out.println("LCM="+lcm);
	}
}