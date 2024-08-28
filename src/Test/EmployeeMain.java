package Test;
class Employee{
	static	String EmployeeName = "Nayan";
	static String EmployeePost = "HR";
	int salary = 100000;
	
	public static void EmployeeInfo() {
		System.out.println(EmployeePost+" position is holding by : "+EmployeeName);
	}
	public void EmployeeIncome() {
		System.out.println(EmployeePost+" position is holding by : "+EmployeeName + " having monthly income :"+salary);
	}
}
class EmployeeMain{
	public static void main(String[]args) {
		Employee employee = new Employee();
				Employee.EmployeeInfo();
				employee.EmployeeIncome();
		
	}
}
	