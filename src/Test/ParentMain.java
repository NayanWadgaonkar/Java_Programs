package Test;
class Parent {
	String name;

public Parent(String name) 
{
	this.name = name;
}
public void ParentInfo()
{
	System.out.println(name+" is the parent name");
}
}
class Child1 extends Parent {
	private int age;

	public Child1(String name,int age) {
		super(name);
		// TODO Auto-generated constructor stub
		this.age=age;
	}
	public void ParentInfo() {
		super.ParentInfo();
		
		System.out.println(age+" is the age of child");
	}
	
}
class ParentMain{
	public static void main(String[]args) {
		Child1 child = new Child1("Nayan",25);
		child.ParentInfo();
		
		
	}
}
