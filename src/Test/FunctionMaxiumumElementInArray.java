package Test;
class FunctionMaxiumumElementInArray{
	public static void PrintMaxElement(int[] array)
	{
		if(array == null || array.length ==  0)
		{
			System.out.println("Array is empty");
			return;
		}
		int MaxElement = array[0];
		for ( int i=1;i<array.length;i++)
		{
			if(array[i] > MaxElement)
			{
				MaxElement = array[i];
			}
		}
		System.out.println("Max Elemets in array : "+MaxElement);
	}
	public static void main(String[]args) {
		int[] array = {1,3,7,7,5,2};
		PrintMaxElement(array);
	}
}


