package Test;
class FactorialNumbersRecursiveFunction{
	
	public static int Factorial(int n)
	{
		if(n==0) 
		{
			return 1 ;
		}
		else
		{
			return n * Factorial(n-1);
			
		}
	}
		public static void main(String[]args) 
		{
			int n = 4;
			int result = Factorial(n);
			System.out.println(result);
			
		}
	}
