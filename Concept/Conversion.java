import java.util.Scanner;
class Conversion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		String str = sc.next();
		String result = "";


        if (str.length()%2==0)
        {
			for (int i =0;i<str.length() ;i++ )
			{
				char ch = str.charAt(i);

				if ((ch-'0')%2==1)
				{
					ch = (char)(ch+1);
				}
				result=result+ch;
			}
			
        }
		else{
			for (int i = 0;i<str.length() ;i++ )
			{
				char ch = str.charAt(i);
				if ((ch-'0')%2==0)
				{
                    ch = (char)(ch+1);
				}
				result=result+ch;
			}
			
		}
         System.out.println(result);		
	}
}
