import java.util.Scanner;
class SwapTwoNumbers
{
	public static void main(String[] args)
	{
		int x,y,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x value:");
		x=s.nextInt();
		System.out.println("Enter y value:");
		y=s.nextInt();
		System.out.println("Before swap:"+"x"+"="+x+","+"y"+"="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap:"+"x"+"="+x+","+"y"+"="+y);
	}
}