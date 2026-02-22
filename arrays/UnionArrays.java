import java.util.*;
public class UnionArrays
{
	public static void main(String[] args)
	{
		int arr1[]={1,2,2,3,4,5,5};
		int arr2[]={1,2,3,3,4,4,5,6,6};
		int i;
		Set<Integer>set=new HashSet<>();
		for(i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		System.out.print("Union of the arrays:");
		for(int value:set)
		{
			System.out.print(value+" ");
		}
	}
}