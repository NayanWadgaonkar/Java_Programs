package Test;
class StudentOops{
	String name;
	int age;
	double grade;
	
	
	public StudentOops(String name, int age, double grade) {
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	public static void main(String[]args) {
		StudentOops student = new StudentOops("Nayan",25,90.00);
		System.out.println("The name of student: "+student.getName());
		System.out.println("The age of student: "+student.getAge());
		System.out.println("The grade of student: "+student.getGrade());
		
	}
}