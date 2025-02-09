import java.util.Scanner;
class Sum_Even_Odd 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number : ");
	   int num = sc.nextInt();

	   int oddsum =0;
	   int evensum=0;
	   int rem ;

	   for (int i =1;num>0 ;i++ )
	   {
		   rem = num%10;
		   if (rem%2==0)
		   {
               evensum= evensum + rem;
		   }
		   else{
			oddsum = oddsum + rem;
		   }
		   num = num/10;
	   }
	   System.out.println("oddsum " + oddsum);
	   System.out.println("evensum " + evensum);
	}
}
