class RecursionReverse
{
	static int rev=0;
	public static void main(String[] args)
	{
		int n=123;
		reverse(n);
		System.out.println("Reverse="+rev);
	}
	static void reverse(int n)
	{
		if(n==0)
		{
			return;
		}
		rev=rev*10+n%10;
		reverse(n/10);
	}
}