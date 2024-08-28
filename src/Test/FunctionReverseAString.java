package Test;
class FunctionReverseAString{
	public static String ReverseString(String s) {
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
  	return sb.toString();
	}
	public static void main(String[]args)
	{
		String s = "Aniket";
		String reverse = ReverseString(s);
		System.out.println(reverse);
		
}
}