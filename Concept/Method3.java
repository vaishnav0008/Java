import java.util.Scanner;
class Method3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start");
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
		double rupee= sc.nextDouble();
		rupeeToDollar(rupee);
        System.out.println("main end");
	}

	public static void rupeeToDollar(double rup){
		System.out.println("rupeeToDollar start");
		double dollar=rup/87.15;
		System.out.println(dollar);
		dollarToEuro(dollar);
		System.out.println("rupeeToDollar end");
	}

	public static void dollarToEuro(double dollar){
		System.out.println("dollarToEuro start");
		double euro = dollar*0.95;
		System.out.println(euro);
        euroToDirhams(euro);
		System.out.println("dollarToEuro end");
	}

	public static void euroToDirhams(double euro){
		System.out.println("euroToDirham start");
		double dirhams=euro*3.85;
		System.out.println(dirhams);
		System.out.println("euroToDirham end");
	}
}






