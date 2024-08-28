package Test;
class SumOfAllArrayElements{
	public static void main(String[]args) {
		int [] array = {10,20,30,40,50,60,70,80,90,100};
		//int a = (array.length);
		int sum = 0;
		for(int i=0;i<array.length;i++) {
		sum = sum + array[i];
		}
		System.out.println(sum);
	}
}