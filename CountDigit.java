import java.util.Scanner;
public class CountDigit
{
	public static void main(String[] args)
	{
		int num,digit,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		System.out.println("Enter the digit to count:");
		digit=s.nextInt();
		while(num!=0)
		{
			int r=num%10;
			if(r==digit)
			{
				count++;
			}
			num/=10;
		}
		System.out.println(digit+" occurs "+count+" times");
		s.close();
	}
}