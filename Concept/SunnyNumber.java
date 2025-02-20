import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        int temp = num;
		int num1=num+1;
		boolean sunny=false;

		for (int i =1;i*i<=num1 ;i++ )
		{
           if (i*i==num1)
           {
               sunny=true;	
			   break;
           }
		}
		if (sunny)
		{
			System.out.println("its a sunnynumber");
		}
		else
			System.out.println("its not a sunny number");

	}
}
