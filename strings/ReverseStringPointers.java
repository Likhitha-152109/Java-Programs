import java.util.*;
public class ReverseStringPointers
{
	public static void main(String[] args)
	{
		String s="hello";
		char arr[]=s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			char temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
		System.out.println("Reversed string:"+new String(arr));
	}
}
		