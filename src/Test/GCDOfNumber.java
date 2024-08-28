package Test;
import java.util.Scanner;
class GCDOfNumber{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
	
		int GCD = (number1 < number2)? number1 : number2;
		while(true)
		{
			if(number1%GCD == 0 && number2%GCD == 0)
			{
				System.out.println("the GCD OF "+number1+" and "+ number2 +" is "+ GCD);
			}
			else 
			{
				--GCD;
			}
		}
}
}