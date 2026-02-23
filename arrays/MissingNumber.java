import java.util.*;
public class MissingNumber
{
	public static void main(String[] args)
	{
		int arr[]={1,2,4,5};
		int n=5;
		int totalsum=n*(n+1)/2;
		int arraysum=0;
		for(int i=0;i<arr.length;i++)
		{
			arraysum=arraysum+arr[i];
		}
		int missingnumber=totalsum-arraysum;
		System.out.print("Missing:"+missingnumber);
		}
	}