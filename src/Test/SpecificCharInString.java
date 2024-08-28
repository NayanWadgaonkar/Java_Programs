package Test;
class SpecificCharInString{
	public static void main(String[]args) {
		String s = "Praha ha ha ha ";
		char term = 'h';
		int count =0;
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==term)
			{
				count++;
			}
		}
		System.out.println("the occurance of character "+term +" in string is "+count+" times ");
	}
}