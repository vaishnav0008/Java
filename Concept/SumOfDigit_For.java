import java.util.Scanner;
class SumOfDigit_For 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum =0;
		int rem;
		for (int i = 1;num>0 ;i++ )
		{
			rem = num%10;
			sum = sum + rem;
			num= num/10;
		}
		System.out.println(sum);
	}
}
