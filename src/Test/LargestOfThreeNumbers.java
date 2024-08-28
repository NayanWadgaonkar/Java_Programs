package Test;
import java.util.Scanner;
class LargestOfThreeNumbers{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2= scanner.nextInt();
        int number3 = scanner.nextInt();
        int largest;
        if(number1 >= number2 && number1 >= number3)
        {
        	largest = number1;
        }
        else if (number3 >= number1 && number3 >= number2)
        {
        	largest = number3;
        }
        else
        {
        	largest = number2;
        }
        System.out.println("The largest number is:"+ largest);
       
    }

}