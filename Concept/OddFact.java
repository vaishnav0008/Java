class  OddFact
{
	public static void main(String[] args) 
	{
		int num = 23174;
		int dup = num;
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			
			
				if (rem%2==1)
				{
                    int fact = 1;
					for (int i = rem;i>=1 ;i-- )
					{
						fact= fact*i;
					}
					sum += fact;
				}
			
			
			num/=10;
		}
		System.out.println(dup);
		System.out.println("sum of fact of odd from digit is : "+sum);
	}
}
