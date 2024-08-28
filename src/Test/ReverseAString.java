package Test;
class ReverseAString{
	public static void main(String[]args)
	{
		String s = ("Aniket");
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("reverse of string is "+sb);
	}
}