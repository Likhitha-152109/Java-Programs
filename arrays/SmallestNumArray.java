import java.util.Scanner;
class SmallestNumArray
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest element:"+min);
	}
}