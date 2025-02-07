import java.util.Scanner;
class Switch3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character ");
		char ch = sc.next().charAt(0);
		switch (ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		  {
			System.out.println("it is a vowel");
		    break;
		  }
	   default :
			{
				System.out.println("its not a vowel");
				break;
			}
		}
	}
}
