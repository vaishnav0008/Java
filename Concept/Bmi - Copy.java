import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight in pound : ");
		float weight = sc.nextFloat();
        
		System.out.println("enter the height in inches : ");
		float height = sc.nextFloat();
        
		double kg = weight * 0.45359237;
		double meter = height * 0.0254;
		
		double bmi = kg/(meter*meter);
		System.out.println(bmi);

	}
}
