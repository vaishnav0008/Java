import java.util.Scanner;
class Alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enterr a character : ");
		char ch = sc.next().charAt(0);

		String op = ((ch >= 'a' && ch <='z')||(ch>='A' && ch<='Z'))?((ch>='a' && ch<='z')?(ch+" is lower case"):(ch+" is upper case")):((ch>='0' && ch<='9')?(ch+" is a digit"):(ch + " is a special character"));
		System.out.println(op);
	}
}
