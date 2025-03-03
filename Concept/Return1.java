class Return1 
{
	public static void main(String[] args) 
	{
	     String var = mergeName("Vaishnav" , "Charde");	
		 System.out.println(var);

	}

	public static String mergeName(String fname, String lname)
	{
		String ans = fname + " " + lname;
		return ans;
	}
}
