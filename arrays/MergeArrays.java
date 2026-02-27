import java.util.*;
public class MergeArrays
{
	public static void main(String[] args)
	{
		int arr1[]={1,3,5};
		int arr2[]={2,4,6};
		int k=0;
		int merged[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			merged[k]=arr1[i];
			k++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			merged[k]=arr2[j];
			k++;
		}
		for(int x:merged)
		{
			System.out.print(x);
		}
	}
}
