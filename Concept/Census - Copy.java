class Census 
{
	public static void main(String[] args) 
	{
		final int oldp= 312032486;
		long sec5 = (365*24*60*60)*5;
		long birth = sec5/7;
		long death = sec5/13;
		long imm = sec5/45;
		long newp = oldp + birth - death +imm;
		System.out.println("the new popupation is : "+newp);
	}
}
