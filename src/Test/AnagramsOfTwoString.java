package Test;

import java.util.Arrays;

class AnagramsOfTwoString{
	public static void main(String[]args) {
		String str1 = "listen";
		String str2 = "slient";
		
		if(areAnagrams(str1,str2))
		{
			System.out.println("both strings are anagrams");
		
		}
		else
		{
			System.out.println("both strings are not anagrams ");
		}
		
	}

	public static boolean areAnagrams(String str1, String str2) {
		if(str1.length()!= str2.length()) {
		// TODO Auto-generated method stub
		return false;
		}
		
		char[] Array1= str1.toCharArray();
		char[] Array2= str2.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
				return Arrays.equals(Array1, Array2);
	}
}