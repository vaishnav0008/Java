import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		int dup = num;
        int rev = 0;
		for (int i = 1;num>0 ;i++ )
		{
			int rem = num%10;
            rev = rev*10 + rem;
			num = num/10;
		}
		if(rev==dup){
			System.out.println("it is a palindrome");
		}
		else
			System.out.println("its not a palindrome");
	}
}
