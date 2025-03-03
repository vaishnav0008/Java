class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<=10000 ;i++ )
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}

	public static int  count(int num)
	{
		int ct = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			int rem = i%10;
             ct++;
		}
		return ct;
	}

	public static  int power(int digit,int ct)
	{
		int pow=1;
		for (int i = 1;i<=ct ;i++ )
		{
			pow = pow *digit;
		}
		return pow;
	}

	public static boolean isArmstrong(int num)
	{
		int ct= count(num);
		int sum = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			sum+=power(i%10,ct);
		}
		return num==sum;
	}
}
