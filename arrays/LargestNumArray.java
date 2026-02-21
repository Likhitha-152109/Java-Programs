import java.util.Scanner;
class LargestNumArray
{
	public static void main(String[] args)
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of the array:");
	int n=s.nextInt();
	int arr[]=new int[n];
	
	System.out.println("Enter elements:");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("Maximum number"+max);
	}
}
	