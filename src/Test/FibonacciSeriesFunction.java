package Test;
class FibonacciSeriesFunction
{
	public static int Fibonacci(int n) 
	{
		int a = 0;
		int b=1;
		int c;
		if(n==0)
			return a;
		for (int i=1;i<=n;i++) 
		{
		c = a+b;
			a=b;
			b=c;
		}
		return b;
	}
	
	public static void main(String[]args) {
		int n =9;
		int result = Fibonacci(9);
		System.out.println(result);
		
	}
	}