import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if (num%7==0|| num%10==7)
		{
			System.out.println("Its a BuzzNumber");
		}
		else
			System.out.println("its not a BuzzNumber");
	}
}
