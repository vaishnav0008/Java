class Frequency_2 
{
	public static void main(String[] args) 
	{
		int max=0;
		int maxdgt=0;
		int mindgt=0;b
		int min = 9;
		long num = 1235346541346l;
		for (int i =0;i<=9 ; i++)
		{
			int cnt=0;
			for (long j = num;j>0 ;j/=10 )
			{
				long rem = j%10;
				if (rem==i)
				{
					cnt++;
				}
				
			}
			if (cnt!=0)
			{
				System.out.println(i +" : "+ cnt);
				if (max<cnt)
				{
					max=cnt;
					maxdgt=i; 
				}

				if (min>cnt)
				{
					min= cnt;
					mindgt=i;
				}

				
			}
			
			
		}
		System.out.println("the max digit is "+maxdgt+" with a freq of "+max);
		System.out.println("the min digit is "+mindgt+" with a freq of "+min);
		
		
	}
}
