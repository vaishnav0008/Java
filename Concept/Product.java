class Product 
{
	public static void main(String[] args) 
	{
		int num = 7952;
		int pd=1;
		int rem = num%10;
		pd = pd*rem;

		num = num/10;
        rem = num%10;
        pd = pd*rem;

		num = num/10;
        rem = num%10;
        pd = pd*rem;

		num = num/10;
        rem = num%10;
        pd = pd*rem;

		System.out.println(pd);
	}
}
