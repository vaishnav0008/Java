class MockProblem2 
{
	public static void main(String[] args) 
	{
		int range=50;
		for (int k =1;k<=range ;k++ )
		{
			int num = k;
			boolean flag = true;
			if (num<2)
			{
				flag = false;
			}
			for (int i =2;i<num ;i++ )
			{
				if (num%i==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				int prime=num;
				if (prime>9)
				{
					boolean flag1=true;
					outerLoop:
					for (int i =prime;i>0 ;i/=10 )
					{
						int dgt=i%10;
						if (dgt<2)
						{
							flag1=false;
							break outerLoop;
						}
					    for (int m=2;m<dgt ;m++ )
					    {
							if (dgt%m==0)
							{
								flag1=false;
								break outerLoop;
							}
					    }
					}
					if (flag1)
					{
						System.out.print(prime+ " ");
					}
					else{
						System.out.print(prime+" ");
					}
				}
			}
		}
	}
}
