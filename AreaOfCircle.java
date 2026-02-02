import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[] args)
	{
		double radius,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=s.nextDouble();
		if(radius<0)
		{
			System.out.println("Radius cannot be negative");
			return;
		}
		else
		{
		area=Math.PI*radius*radius;
		System.out.println("Area of the circle is "+area);
		}
	}
}