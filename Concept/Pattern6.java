import java.util.Scanner;
class Pattern6
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
				if (j==num-1||i==num-1||j==0||i==0)
				{
					System.out.print("*" + " " );
				}
				else{
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}
}
