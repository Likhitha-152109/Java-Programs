import java.util.*;
class RemoveDuplicates
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,5,5,2,1,4,5};
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			set.add(num);
		}
		System.out.println("Array after removing duplicates:"+set);
        System.out.println("Size"+set.size());
	}
}	