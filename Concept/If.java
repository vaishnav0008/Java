import java.util.Scanner;
class If 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your bill amount");

		double billAmt= sc.nextDouble();

		if (billAmt>2000)
		{
			billAmt-=(billAmt*0.1);
		}
		System.out.println(billAmt);
	}
}
