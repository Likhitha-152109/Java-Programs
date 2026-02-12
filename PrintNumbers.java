import java.util.Scanner;
class PrintNumbers
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}