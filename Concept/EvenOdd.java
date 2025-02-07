import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number :");
		int num = new Scanner(System.in).nextInt();
		//int result = num/2;
		System.out.println(num/2 == num/2.0);
		//System.out.println(num/2 > 0);
	}
}
