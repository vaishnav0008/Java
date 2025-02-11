import java.util.Scanner;
class Highest_and_Smallest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int num = sc.nextInt();
		int dup = num;

		int max = 0;
		int min = 9;

		for (int i =dup;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (rem>max)
			{
				max = rem;
			}
		}
		System.out.println("the highest from "+num+" is "+max);

		for (int i=dup;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (rem<min)
			{
				min= rem;
			}
		}
		System.out.println("the smallest from "+num+"is "+min); 
	}
}
