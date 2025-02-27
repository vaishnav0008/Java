import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        String bin ="";
        int for1=0;
		int for0=0;

		for (int i = num;i>0 ;i/=2 )
		{
           bin= (i%2)+bin;
		}
		System.out.println(bin);

        for (int i = 0;i<bin.length() ;i++ )
        {
			char ch = bin.charAt(i);
			if (ch=='1')
			{
				for1++;
				
			}
			else
				for0++;
        }
		if (for1%2==0)
		{
			System.out.println("its a evil number");
		}
		else
			System.out.println("its not");
	}
}
