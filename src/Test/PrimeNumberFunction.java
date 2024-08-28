package Test;
class PrimeNumberFunction
{
public static void prime(int n)
		{
	int m = n / 2;
	int Flag=0;
	
	   for (int i=2;i<=m;i++) 
		   
	        {
	           if(n%i==0)
	        		  {
	        			 System.out.println(n+" number is not prime number ");
	        			 Flag = 1;
	        			 break;
	        		   }
	         }
	        	 if (Flag == 0) 
	        	 {
	        	 	System.out.println(n+ " number is prime number");
	            	}
	      }
	  
public static void main(String[]args) 
{
	prime(1);
	prime(3);
	prime(7);
	prime(9);
	prime(11);
	prime(10);
	prime(2);
	prime(27);
}
}