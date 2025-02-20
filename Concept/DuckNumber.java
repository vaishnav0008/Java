import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number : ");
		String num = sc.next();
		if (num.charAt(0)!='0')
		{
            if (num.contains("0"))
            {
				System.out.println("Its a duck number");
            }
			else
				System.out.println("Its a duck number");
		}
		else
			System.out.println("Its not a duck number");
	}
}
