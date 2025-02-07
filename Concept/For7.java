import java.util.Scanner;
class For7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name : ");
		String name = sc.next().toUpperCase();
		int len = name.length();

		for (int i = 0;i<len ;i++ )
		{
			System.out.println(name.charAt(i));
		}
	}
}
