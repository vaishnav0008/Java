import java.util.Scanner;
class Palindrome_string 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String dup = str;
		String rev = "";

		for (int i =0;i<str.length() ;i++ )
		{
              rev = str.charAt(i) + rev;
		}
		System.out.println(rev);

		if (dup.equals(rev))
		{
			System.out.println("it is palindrome");
		}
		else{
			System.out.println("it is not a plaindrome");
	}}
}
