package Test;
class Calculator{
	 public int add(int a,int b) {
		 return a +b;
	 }
	 public int add(int a,int b,int c) {
		 return a +b + c;
	 }
	 public int add(int a,int b,int c,int d) {
		 return a +b +c + d;
	 }
}
class CalculatorMain{
	public static void main(String[]args) {
		Calculator calculator= new Calculator();
		System.out.println("The additin of int a and int b is : "+calculator.add(10, 20));
		System.out.println("The additin of int a,int b and int c is : "+calculator.add(10, 20,30));
		System.out.println("The additin of int a, int b,int c and int d is : "+calculator.add(10, 20,30,40));
	}
}