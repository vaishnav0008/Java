import java.util.Scanner;
class Switch2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("******* WELCOME ********");
        System.out.println("1. MONDAY");
        System.out.println("2. TUESDAY");
		System.out.println("3. WEDNESDAY");
		System.out.println("4. THURSDAY");
		System.out.println("5. FRIDAY");
		System.out.println("6. SATURDAY");
		System.out.println("7. SUNDAY");

		System.out.println("Enter the number according to the day : ");
		int day = sc.nextInt();

		switch (day)
		{
		case 1:
			{
				System.out.println("do maths work");
				break;
			}
		case 2:
			{
				System.out.println("do english work");
				break;
			}
		case 3:
			{
				System.out.println("do history work");
				break;
			}
		case 4:
			{
				System.out.println("do geography work");
				break;
			}
		case 5:
			{
				System.out.println("do marathi work");
				break;
			}
		case 6:
			{
				System.out.println("do art and craft");
				break;
			}
		case 7:
			{
				System.out.println("its a holiday");
				break;
			}
		default :
			{
				System.out.println("invalid");
				break;
			}
		}
	}
}
