import java.util.Scanner;
class Factorrr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
         int sum =0;
		for (int i =1;i<=num ;i++ )
		{
               if(num%i==0){
				System.out.println(i);
				sum = sum + i;
               }

		}
		System.out.println(sum);
	}
}
