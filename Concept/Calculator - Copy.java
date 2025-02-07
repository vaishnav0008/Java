import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num 1 : ");
		float num1=sc.nextFloat();

		System.out.println("enter the num 2 : ");
		float num2 = sc.nextFloat();

		System.out.println("enter the operator : ");
		char op = sc.next().charAt(0);
        
		float ans = 0;
        ans = (op == '+')?(num1+num2):
			       (op == '-')?(num1-num2):
			       (op == '*')?(num1*num2):	
			       (op == '/')?(num1/num2):
			       (op == '%')?(num1%num2):0.00000f;
		
		//System.out.println(ans);

		String output  = num1 + " " + op + " " + num2 + " = " + ans;

		if(!(ans == 0.00000f))
		   System.out.println(output);

	}
}
