import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();

		System.out.println((num ==2 || num ==3 || num==5)?(num + " is a prime number"):((num %2 ==0 || num%3==0 || num %5==0)?(num + " is not a prime number"):(num + " is prime")));
	}
}
