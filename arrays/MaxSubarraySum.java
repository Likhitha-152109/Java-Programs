import java.util.*;
public class MaxSubarraySum
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		int k=3;
		int wsum=0;
		for(int i=0;i<k;i++)
		{
			wsum+=arr[i];
		}
		int maxsum=wsum;
		for(int i=k;i<arr.length;i++)
		{
			wsum+=arr[i];
			wsum-=arr[i-k];
			if(wsum>maxsum)
			{
				maxsum=wsum;
			}
		}
		System.out.print("Maxsubarray sum:"+maxsum);
	}
}
