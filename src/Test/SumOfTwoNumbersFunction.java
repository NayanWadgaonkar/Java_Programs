package Test;
class SumOfTwoNumbersFunction{
	int a;
	int b;
	public static int sum(int a, int b) {
		return a + b;
	}
	public static void main(String[]args) {
		int a = 10;
		int b = 20;
		int result = sum(a,b);
		System.out.println(result);
	}
}