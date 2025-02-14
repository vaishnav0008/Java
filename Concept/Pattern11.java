import java.util.Scanner;
class Pattern11
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
				if (j==0||i==0||j==num-1||i==num-1||j==i||i+j==num-1||j==(num-1)/2||i==(num-1)/2||j==(num-1)/4||j==(num-1)*3/4)
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
