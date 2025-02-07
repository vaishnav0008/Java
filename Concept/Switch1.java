class Switch1 
{
	public static void main(String[] args) 
	{
	    byte ip = 1;
		switch (ip)
		{
		case 1:
			{
				System.out.println("from case 1");
				break;
			}

		case 2:
			{
				System.out.println("from case 2");
				break;
			}
		
		case 3:
			{
				System.out.println("from case 3");
				break;
			}
		default :
			{
				System.out.println("invalid");
				break;
			}
		
		}
	}
}
