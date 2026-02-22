import java.util.*;
public class RemovingZeroes
{
	public static void main(String[] args)
	{
		int arr[]={1,0,2,0,0,3,4,5};
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}