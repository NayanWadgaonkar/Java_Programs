package Test;
class LengthOfString{
	public static void main(String[]args) {
	String myString = "Prague ";
	int length = myString.length();
	int count = 0;
	for(int i=0;i<length;i++) {
		count++;
	}
	System.out.println("Length of string: "+ length);
}
} 