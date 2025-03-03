class Method2 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		add(2,3);
		division(10.0,12.0);
		System.out.println("main end");
	}

	public static void add(int a , int b){
		System.out.println("add start");
		int res = a+b;
		System.out.println(res);
		System.out.println("add end");
	}

	public static void division(double num, double den){
		System.out.println("Division start");
		Double res=num/den;
		System.out.println(res);
		System.out.println("division end");
	}


}
