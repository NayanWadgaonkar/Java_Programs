package Test;
import java.util.Scanner;
class LeapYearCheck{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 ==0)
		{
			System.out.print("The given Year: "+year+" is leap year");
		}
		else 
		{
			System.out.println("The given Year: "+year+" is not leap year");
		}
		
	}
}