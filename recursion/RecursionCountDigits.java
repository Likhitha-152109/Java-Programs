class RecursionCountDigits
{
	public static void main(String[] args)
	{
		int n=4567;
		System.out.println("Digits="+count(n));
	}
	static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return 1+count(n/10);
	}
}
