import java.util.*;
public class ArrayLargestNum
{
	public static void main(String[] args)
	{
		int arr[]={2,7,4,8,3};
		int i;
		int max=arr[0];
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
			max=arr[i];
			}
		}
	System.out.println("Largest number:"+max);
	}
}