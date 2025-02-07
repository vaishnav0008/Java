class Smallest 
{
	public static void main(String[] args) 
	{
		int a =22;
		int b =4;
		int c = 1;
		
		int small = (a>b)?((a>c)?(c):(a)):((b>c)?(c):(b));
		System.out.println(small);
	}
}
