import java.util.Scanner;
class SumOfFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
        int rem;
		//int fact =1;
		int sum = 0;
		//for (int i = 1;i<=num ;i++ )
	//	{
	//		fact = fact*i;
	//		sum = sum +fact;
	//	}
	//	System.out.println(fact);
	//	System.out.println(sum);

	for (int i =1 ;num>0 ;i++ )
	{
		int fact =1;
       rem = num%10;
	   for (int j=1;j<=rem ;j++ )
	   {
		   fact = fact*j;
		   
	   }
	   sum = sum+fact;
	   num = num/10;
	}
	System.out.println(sum);
	//System.out.println(fact);
	}
}
