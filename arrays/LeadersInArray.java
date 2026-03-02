import java.util.*;
public class LeadersInArray
{
	public static void main(String[] args)
	{
		int arr[]={16,17,3,5,2};
		int n=arr.length;
		int leaders[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					break;
				}
			}
				if(j==n)
				{
					leaders[k]=arr[i];
					k++;
				}
			}
		
		System.out.println("Leaders in array:");
		for(int i=0;i<k;i++)
		{
			System.out.print(leaders[i]+" ");
			
		}
	}
}
		
		