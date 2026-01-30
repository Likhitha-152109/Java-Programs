import java.util.*;
public class ArrayLargestNum
{
	public static void main(String[] args)
	{
		int arr[]={2,5,3,7,5,9};
		int i;
		int max=arr[0];
		for(i=0;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
		System.out.println("The largest number in the array:"+max);
	}
}