import java.util.Scanner;
class FactOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
        int rem;
		int sum =0;
		for (int i=1;num>0 ;i++ )
		{
		   int fact =1;
           rem= num%10;
		   if (rem %2 ==1)
		   {
			   for (int j =1;j<=rem ;j++ )
			   {
				   fact = fact*j;
			   }
			   sum = sum + fact;
		   }
		   num = num/10;
		}
        System.out.println(sum);
	}
}
