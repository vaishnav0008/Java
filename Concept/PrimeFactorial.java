import java.util.Scanner;
class PrimeFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 2 ;i<=num ;i++ )
		{
			if(num%i==0){
				int count = 0;
				for (int j =2 ;j<i ;j++ )
				{
					if (i%j==0)
					{
						count ++;
					}
				}
					if (count==0)
					{
						System.out.println(i);
					}
				}
		}
	}
}
