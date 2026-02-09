class RecursionPower
{
	public static void main(String[] args)
	{
		int base=2,exp=3;
		System.out.println("Result="+power(base,exp));
	}
	static int power(int b,int e)
	{
		if(e==0)
		{
			return 1;
		}
		return b*power(b,e-1);
	}
}