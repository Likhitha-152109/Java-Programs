import java.util.*;
public class InsertElement
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int element=10;
		int position=2;
		int b[]=new int[a.length+1];
		for(int i=0;i<position;i++)
		{
			b[i]=a[i];
		}
		b[position]=element;
		for(int i=position+1;i<b.length;i++)
		{
			b[i]=a[i-1];
		}
		for(int x:b)
		{
			System.out.print(x+" ");
		}
	}
}
