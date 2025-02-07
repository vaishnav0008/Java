import java.util.Scanner;
class EvenOdd2 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println((num/2)*2 == num);
	}
}
