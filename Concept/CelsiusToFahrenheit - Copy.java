import java.util.Scanner;
class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the degree in Celsius : ");
		double Celsius = sc.nextDouble();
	    
		double Fahrenheit = (9.0/5)*Celsius+32;
		System.out.println(Celsius+" Celsius is "+Fahrenheit+" Fahrenheit");
	}
}
