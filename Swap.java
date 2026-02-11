import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x value:");
		x=s.nextInt();
		System.out.println("Enter y value:");
		y=s.nextInt();
		System.out.println("Before swap:"+"x"+"="+x+","+"y"+"="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:"+"x"+"="+x+","+"y"+"="+y);
	}
}
		
		
		