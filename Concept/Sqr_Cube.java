class Sqr_Cube 
{
	public static void main(String[] args) 
	{
		int z =0;
		for (int i=12;i<=16 ;i++)
		{
			if (i%2==0)
			{
				int a = i*i;
				System.out.print(a+" ");
			}
			else{
				int b= i*i*i;
				System.out.print(b+" ");
			}
		}
	}
}
