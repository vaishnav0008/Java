import java.util.Scanner;
class AreaofCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		final float pi = 22/7f;

		System.out.println("enter the radius: ");
		float r = sc.nextFloat();
		float area = pi*r*r;
		float perimeter = 2*pi*r;
		System.out.println("area of circle of radius "+r+" is : "+area);
	    System.out.println("perimeter is "+perimeter);
	}
}
