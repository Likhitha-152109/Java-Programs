import java.util.*;
public class RearrangeArray
{
	public static void main(String[] args)
	{
		int arr[]={1,-2,3,-4,-5,6,-7,8};
		int result[]=new int[arr.length];
		int posIndex=0;
		int negIndex=1;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			if(num>=0 && posIndex<result.length)
			{
				result[posIndex]=arr[i];
				posIndex=posIndex+2;
			}
			else if(num<0 && negIndex<result.length)
			{
				result[negIndex]=arr[i];
				negIndex=negIndex+2;
			}
		}
		System.out.print("Rearranged array:");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}