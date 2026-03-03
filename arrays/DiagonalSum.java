import java.util.*;
public class DiagonalSum
{
	public static void main(String[] args)
	{
		int a[][]={
			{1,2,3},
				{4,5,6},
					{7,8,9}
		};
		int n=a.length;
		int psum=0;
		int ssum=0;
		for(int i=0;i<n;i++)
		{
			psum=psum+a[i][i];
			ssum=ssum+a[i][3-1-i];
		}
		System.out.println("Primary diagonal sum="+psum);
		System.out.println("Secondary diagonal sum="+ssum);
	}
}