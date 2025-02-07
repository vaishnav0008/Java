import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month : ");
		String month = sc.next().toUpperCase();
		String op = ((month.equals("OCT"))||(month.equals("NOV"))||(month.equals("DEC"))||(month.equals("JAN")))?(month+" is a winter"):
			        ((month.equals("FEB"))||(month.equals("MAR"))||(month.equals("APR"))||(month.equals("MAY")))?(month+ " is a summer"):
			        ((month.equals("JUN"))||(month.equals("JUL"))||(month.equals("AUG"))||(month.equals("SEP")))?(month + " is a monsoon"):
			        "invalid word";
		System.out.println(op);
	}
}
