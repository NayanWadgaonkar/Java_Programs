package Test;

class ReplaceSubStringWithinString{
	public static void main(String []args) {
		String originalString = " hello world";
		String subStringToReplace = "world";
		String 	replacement = "kanade";
		String newString = originalString.replace(subStringToReplace, replacement);
		System.out.println(newString);
	}
}

