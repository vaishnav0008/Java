import java.util.Scanner;
class PoundsToKilogram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of pound : ");
		float pd = sc.nextFloat();
        float kg = pd * 0.454f;
		System.out.println(pd+" pounds is "+kg+" kg");
	}
}
