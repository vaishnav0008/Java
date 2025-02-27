import java.util.Scanner;
class To_Binary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
		int num = sc.nextInt();
        int cnt = 0;
        String bin="";
		for (int i = num;i>0 ;i/=2 )
		{
			bin = (i%2)+bin;
		}
		System.out.println(num+ " : " + bin);
		

	}
}
