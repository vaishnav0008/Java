import java.util.Scanner;
class Return3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int ip = sc.nextInt();
		int rev = reverse(ip);
        
		if (ip == rev && isPrime(ip))
		{
			System.out.println("palindromic prime");
		}
		else{
			System.out.println("not a palindromin prime");
		}
	}

	public static int reverse(int num)
	{
		int rev =0;
		for (int i =num;i>0 ;i/=10 )
		{
			rev = rev*10 + (i%10);
		}
		return rev;
	}

	public static boolean  isPrime(int num)
	{
		System.out.println("Prime start");
		int den = 2;
		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				break;
			}
		}
		//System.out.println(den);
		return num==den;
	}
}
