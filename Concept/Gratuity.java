import java.util.Scanner;
class Gratuity 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bill : ");
		float bill = sc.nextFloat();

		System.out.println("tip rate : ");
		float Tiprate = sc.nextFloat();

		float tipAmount = (Tiprate*bill)/100;

        //System.out.println("the tip is : "+ total);
		float totalBill = bill+tipAmount;
		//int totaltotal = (subtotal + total)*100;
		System.out.println("The total bill is :"+totalBill );
	    System.out.println("The total tip amount is : "+tipAmount );
	}
}
