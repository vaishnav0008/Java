import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		boolean bouncy = false;
		boolean increase = false;
		boolean decrease = false;

		for (int i = num, j = num/10 ;j>0 ; i/=10, j/=10 )
		{
			int rem1=i%10;
			int rem2=j%10;

			if (rem1>rem2)
			{
				increase = true;
				
			}
			else if (rem1<rem2)
			{
				decrease = true;
				
			}
			if (increase && decrease)
			{
				break;
			}
		}
		if (increase && decrease)
		{
			System.out.println("its a bouncy");
		}
		else if (increase)
		{
			System.out.println("its increasing");
		}
		else
		{
			System.out.println("its decreasing");
		}
	}
}
