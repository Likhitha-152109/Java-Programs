import java.util.*;
public class SearchingNum
{
	public static void main(String[] args)
	{
		int arr[]={6,9,5,2,3};
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				System.out.print("Present at index:"+i);
				return;
			}
		}
		System.out.print("Absent");
	}
}
		