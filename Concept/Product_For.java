import java.util.Scanner;
class Product_For 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
        int num = sc.nextInt();
        int rem ;
		int pd = 1;
		for (int i = 1;num>0 ;i++ )
		{
			rem = num%10;
			pd = pd*rem;
			num = num/10;
		}
		System.out.println(pd);
	}
}
