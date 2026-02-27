import java.util.*;
public class SortingArray
{
	public static void main(String[] args)
	{
		int arr[]={5,2,9,1,3};
		int min=i;
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int x:arr)
		{
			System.out.print(x);
		}
	}
}