import java.util.Scanner;
class Increasing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		boolean flag = true;

		for (int i = num,j=num/10;j>0 ;i/=10,j/=10 )
		{
			int rem1 = i%10;
			int rem2 = j%10;
            if (rem1<rem2)
            {
				flag = false;
				break;
			}
		}
		if (flag)
		{
			System.out.println("Its increasing");
		}
		else
			System.out.println("Its not increasing");
	}
}

