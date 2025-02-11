import java.util.Scanner;
class Pin_Verification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int storedPin =1234;
		int attempt = 0;
		do
		{
			System.out.println("enter the pin");
			int pin = sc.nextInt();
			if (pin == storedPin)
			{
				System.out.println("Login Success!");
				break;
			}
			else{
				System.out.println("invalid option");
				attempt++;
				System.out.println(3-attempt +"attempt left");
			}
		}
		while (attempt<3);
		if (attempt==3)
		{
			System.out.println("max attempt reached");
		}
	}
}
