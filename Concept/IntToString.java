import java.util.Scanner;
class IntToString 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int op = 0;

		for (int i = 1;i<=num ;i++)
		{
			int rem = num%10;
			switch (rem)
			{
			case 1:
				System.out.println("One");
			    break;
			case 2:
				System.out.println("Two");
			    break;
			case 3:
				System.out.println("Three");
			    break;
			case 4:
				System.out.println("four");
			    break;
			case 5:
				System.out.println("five");
			    break;
			case 6:
				System.out.println("six");
			    break;
			case 7:
				System.out.println("seven");
			    break;
			case 8:
				System.out.println("eight");
			    break;
			case 9:
				System.out.println("nine");
			    break;
			case 0:
				System.out.println("zero");
			    break;
			default:
				System.out.println("Enter valid");
            
			
			num = num/10;
			}
		}
		System.out.println(op);
	}
}
