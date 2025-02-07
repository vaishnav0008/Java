import java.util.Scanner;
class PassFail 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks : ");
		float marks = sc.nextFloat();
		float per = (marks*100)/600;

		String op = (per>=75)?("grade A with "+per+"%"):
			        (per>=60)?("grade B with "+per+"%"):
			        (per>=35)?("grade C with "+per+"%"):
			         "Failed!!";

		System.out.println(op);
	}
}
