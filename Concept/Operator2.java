import java.util.Scanner;
class Operator2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();

		String op = (num%2==0)?((num%5==0)?("HiTwoFive"):("HiTwo")):((num%5==0)?("HiFive"):(""));
		System.out.println(op);
	}
}
