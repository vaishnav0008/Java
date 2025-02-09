import java.util.Scanner;
class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature in degree");
		double temp = sc.nextDouble();
		double result = 0;

		System.out.println("1. To fahrenheit");
		System.out.println("2. To Kelvin");
		System.out.println("3. To Rankine");

		System.out.println("You want to convert to which scale");
		int opt = sc.nextInt();

		switch (opt)
		{
		case 1:
               result = (1.8*temp)+32;
		         System.out.println(result);
		       break;

		case 2:
			result = temp+273.15;
		   System.out.println(result);
		    break;

		case 3:
			result = (temp*(1.8))+491.67;
		   System.out.println(result);
		    break;

		default :
			System.out.println("invalid option");
		    break;
		}
		
	}
}
