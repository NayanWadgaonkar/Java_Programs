package Test;
class StringPalindrome
{
	public static void main(String[]args)
	{
		String s = "nayan";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();		
		if(s.equals(sb.toString()))
		{
			System.out.println(s+" is palindrome ");
		}
		else 
		{
			System.out.println(s+ " is not palindrome ");
		}
	}
}
