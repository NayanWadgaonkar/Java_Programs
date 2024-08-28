package Test;
class FunctionStringPalindrome{

	public static boolean palindrome(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return s.equals (sb.toString());
		   
	   }
	
	public static void main(String[]args)
	{
		String s = "nayan";
				
		if(palindrome(s))
		{
			System.out.println(s+" is palindrome ");
		}
		else
		{
			System.out.println(s+" is not a  palindrome ");
		}
	}
}