import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();

		for (int i =0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i==num-1)
				{
					System.out.print("*" + " " );
				}
				
			}
			System.out.println();
		}
	}
}
