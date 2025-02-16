class Pattern18 
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0||j==n-1||i==j||j>i)
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
