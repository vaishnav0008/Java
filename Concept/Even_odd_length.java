import java.util.Scanner;
class Even_odd_length
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
        int dup = num;
         
		int cnt = 0;
		while (num>0)
		{
			cnt++;
			num = num/10;
		}
		System.out.println("the digit count is : "+cnt);

		String newNum="";

		if (cnt%2==0)
		{
			for (int i =dup;i>0 ;i/=10 )
			{
				int rem = i%10;
				if (rem%2!=0)
				{
					newNum = ++rem + newNum;
				}
				else{
					newNum = rem+newNum;
				}
			}
		}
		else{
			for (int i=dup;i>0 ;i/=10 )
			{
				int rem = i%10;
				if (rem%2==0)
				{
					newNum = ++rem+newNum;
				}
				else{
					newNum = rem +newNum;
				}
			}
		}
		System.out.println(newNum);
	}
}
