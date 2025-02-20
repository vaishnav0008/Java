import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int prd=1;

		for (int i = num;i>0 ;i/=10 )
		{
			int rem = i%10;
			prd = prd*rem;
			sum=sum+rem;
		}
		if (sum==prd)
		{
			System.out.println("its a SpyNumber");
		}
		else
			System.out.println("its not a spy number");
	}
}
