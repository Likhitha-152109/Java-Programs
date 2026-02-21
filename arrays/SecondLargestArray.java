import java.util.Scanner;
class SecondLargestArray
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
		int slargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>slargest && arr[i]!=max)
			{
				slargest=arr[i];
			}
		}
		System.out.println("Second largest:"+slargest);
	}
}