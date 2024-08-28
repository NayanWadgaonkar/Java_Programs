package Test;
class SpecificValueOfArray
{
	public static void main(String[]args) 
	{
		int [] array = {10,20,30,40,50,};
		int num = 30;
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]==num) {
				System.out.println("element "+num +" is present in array at index "+i);
			}
		}
		System.out.println("element"+num+" is not present in array");
}
}
