package Test;
class FibonacciSeries{
	public static void main(String[]args)
	{
		int terms = 10;
		int a=0;
		int b=1;
		
		for(int i=1;i<=terms;i++)
		{
			System.out.println(a+",");
			int nextterm = a + b;
			a=b;
			b=nextterm;
			//System.out.println(nextterm);
			
		}
	}
}