import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character : ");
		char ch =sc.next().charAt(0);

		String op =(ch == 'a' || ch == 'e' || ch=='i' || ch =='o' || ch== 'u')?(ch + "it is a vowel"):((ch == 'A' || ch == 'E' || ch=='I' || ch =='O' || ch== 'U')?(ch + "it is a vowel"):(ch + " it is not a vowel")); 
		System.out.println(op);
	}
}
