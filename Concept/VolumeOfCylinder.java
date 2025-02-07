import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		final float pi = 22/7f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		float radius = sc.nextFloat();
        System.out.println("Enter the length : ");
		float length = sc.nextFloat();

		float area = pi*radius*radius;
		float volume = area*length;
		System.out.println("the area is : "+area);
		System.out.println("the volume is : "+volume);
	}
}
