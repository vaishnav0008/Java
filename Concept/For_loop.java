class For_loop 
{
	public static void main(String[] args) 
	{
		// 1-10
		for (int i=1;i<=10 ;i++ )
		{
			System.out.print(i+" ");
		}

         System.out.println();
		//A to Z
		for (char ch = 'A';ch<='Z' ;ch++ )
		{
			System.out.print(ch+" ");
		}
        
		System.out.println();
		//z to a
		for (char ch='z'; ch>='a' ;ch-- )
		{
			System.out.print(ch+" ");
		}

		System.out.println();
		//0 to 9
		for (char ch ='0';ch<='9' ; ch++ )
		{
			System.out.print(ch+" ");
		}

		//ascii
		System.out.println();

		for (int i =0;i<=127 ;i++ )
		{
			System.out.println(i+":"+((char)i));
		}
	}
}
