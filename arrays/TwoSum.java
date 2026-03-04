import java.util.*;
public class TwoSum
{
	public static void main(String[] args)
	{
		int arr[]={2,3,4,6,7,11,15};
		int target=9;
		int twosum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				twosum=arr[i]+arr[j];
				if(twosum==target)
				{
					System.out.print("indices:"+i+" "+j);
                    break;					
				}
				
			}
			System.out.println();
			
		}
		
	
	}
}