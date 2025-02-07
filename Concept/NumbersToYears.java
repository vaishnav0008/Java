import java.util.Scanner;
class NumbersToYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("min are : " );
		int min = sc.nextInt();
        int minYear = 365*24*60;
		int years = min/minYear;
        int days = (min%minYear)/(24*60);
		System.out.println("the years are : ");
		System.out.println(years);
        System.out.println("the days are : ");
		System.out.println(days);
	}
}
