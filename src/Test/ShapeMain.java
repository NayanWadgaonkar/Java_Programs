package Test;
abstract class Shape{
	abstract void draw();
	
	abstract double CalculateArea() ;
}
class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("draw a circle");
	}
	public double CalculateArea() {
		return Math.PI*radius*radius;
	}
}
class ShapeMain{
	public static void main(String[]args)
	{
		Circle  circle = new Circle(2);
		circle.draw();
		System.out.println("The area of circle is "+circle.CalculateArea());
	}
}