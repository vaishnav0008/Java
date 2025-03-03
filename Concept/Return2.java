class Return2 
{
	public static void main(String[] args) 
	{
		System.out.println(isStrong(145));
	}

	public static int factorial(int digit)
	{
		int fact=1;
		for (int i = digit;i>0 ;i-- )
		{
			fact = fact*i;
		}
		return fact;
	}

	public static boolean isStrong(int num)
	{
		int sum =0;
		for (int i=num;i>0;i/=10 )
		{
			int rem = i%10;
			sum = sum + factorial(rem);
		}

		return num==sum;
	}
}
