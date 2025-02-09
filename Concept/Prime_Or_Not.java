import java.util.Scanner;
class Prime_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		System.out.println((count == 0)?(num + " is a prime"):(num + " is not a prime"));
	}
}
