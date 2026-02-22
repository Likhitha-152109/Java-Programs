import java.util.*;
public class RightRotation
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		int i;
		int temp=arr[arr.length-1];
		for(i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		System.out.print("Array after right rotation:");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}