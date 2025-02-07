import java.util.Scanner;
class For10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name : ");
		String name = sc.next().toUpperCase();
		int length = name.length();
		for (int i = 0;i<length ;i++ )
		{
			char ch = name.charAt(i);
			if (ch=='A' || ch=='I' || ch =='O' || ch=='E' || ch =='U')
			{
				System.out.println(ch);
			}
		}
	}
}
