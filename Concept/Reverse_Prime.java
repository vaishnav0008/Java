import java.util.Scanner;
class Reverse_Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
        int num = sc.nextInt();
		int rev = 0;

		for (int i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				System.out.println("its not a prime number");break;	
			}
			else{
				System.out.println("its a prime number");
				for (int j=num;num>0 ;num/=10 )
				{
					int rem=num%10;
					rev = rev*10 + rem;
				}
				System.out.println("reverse of a number is "+rev);

				for (int k=2; ; )
				{
					if (rev%2==0)
					{
						System.out.println("its not a EMIRP no.");
						break;
					}
					else{
						System.out.println("its as EMIRP no.");
						break;
					}
				}
			}
		}
		
	}
}
