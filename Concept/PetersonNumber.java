import java.util.Scanner;
class PetersonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        int temp = num;
		int sum =0;
        
        for (int i = num;i>0 ;i/=10 )
        {   
			int rem = i%10;
			int fact = 1;
			for (int j = 1;j<=rem ;j++ )
			{
				fact = fact*j;
			}
			sum = sum+fact;
        }
		if (sum==num)
		{
			System.out.println("its a peterson number");
		}
		else
			System.out.println("not a peterson number");
	}
}
