package Test;
class ReverseOfNumber{
	public static void main(String[]args) {
	int number = 1234;
	int reverseNumber = 0;
	while(number != 0)
	{
		int num = number % 10;
		reverseNumber = reverseNumber * 10 + num;
		number = number / 10;
		System.out.println(reverseNumber);
		
	}
}
}