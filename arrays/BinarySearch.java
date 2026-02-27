import java.util.*;
public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int target=90;
		int index=-1;
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==target)
			{
				index=mid;
				break;
			}
			else if(arr[mid]<target)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		if(index!=-1)
		{
			System.out.print("90 found at "+index);
		}
	}
}