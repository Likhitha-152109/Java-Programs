import java.util.*;
public class SecondLargest
{
	public static void main(String[] args)
	{
		int arr[]={3,8,5,4,9};
		int i;
		int largest=arr[0];
		int slargest=-1;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>slargest && arr[i]!=largest)
				{
					slargest=arr[i];
				}
		}
		System.out.println("Second largest element in the array:"+slargest);
	}
}
			