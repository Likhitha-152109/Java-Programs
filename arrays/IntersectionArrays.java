import java.util.*;
public class IntersectionArrays
{
	public static void main(String[] args)
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]={2,3,4,5,5};
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
				}
			}	
		}
		System.out.println("Intersection arrays:");
			for(int value:set)
			{
				System.out.print(value+" ");
			}
	}
}
		