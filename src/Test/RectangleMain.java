package Test;
class Rectangle{
	int height;
	int width;
	
	public Rectangle(int height, int width) {
		this.height=height;
		this.width = width;
	}
	public void RectangleInfo() {
		System.out.println("height : "+height+" width : "+width);
	}
	public int CalculateArea() {
		return this.height * this.width;
	}
	public void SetDimensions(int height, int width) {
		this.height=height;
		this.width = width;
	}
}
class RectangleMain{
public static void main(String[]args) {
	Rectangle rectangle = new Rectangle(10,20);
	rectangle.RectangleInfo();
	int area = rectangle.CalculateArea();
	System.out.println("Area : "+area);
	rectangle.SetDimensions(30, 40);
	rectangle.RectangleInfo();
	
	area = rectangle.CalculateArea();
	System.out.println("New Area is : "+area );
	
}
}