import java.util.*;
public class EquilibriumIndex
{
	public static void main(String[] args)
	{
		int arr[]={1,3,5,2,2};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int leftsum=0;
			int rightsum=0;
			for(int j=0;j<i;j++)
			{
				leftsum+=arr[j];
			}
			for(int j=i+1;j<n;j++)
			{
				rightsum+=arr[j];
			}
			if(leftsum==rightsum)
			{
				System.out.print("Equilibrium index is:"+i);
				return;
			}
		}
		System.out.println("No equilibrium index");
	}
}