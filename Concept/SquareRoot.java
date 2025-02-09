import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;

		for (int i =1;i<=num ;i++ )
		{
		
                if(i*i==num){
					flag = true;
					System.out.println("Square root");
					
					
                }
				if(i*i>=num)
					break;
		}
		if(!flag){
		   System.out.println("not perfect square root");
		}
	}
}
