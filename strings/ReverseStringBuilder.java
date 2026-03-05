import java.util.*;
public class ReverseStringBuilder
{
	public static void main(String[] args)
	{
		String s="hello";
		String reversed=new StringBuilder(s).reverse().toString();
		System.out.println("Reversed string:"+reversed);
	}
}