class Pattern20 
{
	public static void main(String[] args) 
	{
		int num=1;
		for (int i = 0;i<5 ;i++ )
		{
			int num =i;
			for (int j =0;j<=i ;j++ )
			{
				System.out.print(num+" ");
				num +=(i+j);
			}
			//num++;
			System.out.println();
		}
	}
}
