class RecursionFibonacci
{
	public static void main(String[] args)
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
	static int fib(int i)
	{
		if(i==0 || i==1)
		{
			return i;
		}
		return fib(i-1)+fib(i-2);
	}
}