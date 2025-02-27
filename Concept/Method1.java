class Method1 
{
	public static void main(String[] args) 
	{
		System.out.println("in main method");
		test();
		sum1(1,2);
		primeNo(14);
		factorial(5);
		}
	public static void test(){
		System.out.println("in test method");
	}
	public static void sum1(int a, int b){
		System.out.println(a+b);
	}

	public static void primeNo(int a){
		for (int i =2;i<a ;i++ )
		{
			if (a%i==0)
			{
				System.out.println("its not a prime");
				break;
			}
			else{
				System.out.println("its a prime");
				break;
			}
		}
	}

	public static void factorial(int n){
		int fact =1;
		for (int i = 1;i<=n ;i++ )
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
