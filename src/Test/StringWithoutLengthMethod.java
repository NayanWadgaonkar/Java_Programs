package Test;
class StringWithoutLengthMethod{
	public static void main(String[]args) {
	String myString = "Prague is beautiful";
	char [] charArray=myString.toCharArray();
	int length = charArray.length;
	System.out.println("Length of string: "+ length);
}
}