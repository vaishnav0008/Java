import java.util.Scanner;
class Operator1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character : ");
		char ch = sc.next().charAt(0);

		String op = ((ch>='A' && ch <='Z') || (ch >='a' && ch <='z'))?((ch>='a' && ch <='z')?(ch + "it is a lower case alphabet"):(ch + "it is a upper case alphabet")):((ch>='0' && ch<='9')?(ch + "it is an digit"):(ch + "it is not an digit and it is special char"));
		System.out.println(op);
	}
}
