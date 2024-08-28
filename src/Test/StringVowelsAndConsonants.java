package Test;
class StringVowelsAndConsonants{
	public static void main(String[]args)
	{
		String s1 = "abcdefghijklmnopqrs";
		System.out.println(s1.length());
		String s2 ="aeiou";
		System.out.println(s2.length());
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(j)==s1.charAt(i))
				{
					count++;
				}
			}
		}
		System.out.println("count of vowels: "+count);
		System.out.println("count of consonants: "+(s1.length()-count));
	}
}