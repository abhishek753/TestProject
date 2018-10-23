package package3;

public class InstanceVariable {
	public String Name;
	private int Salary;
	public InstanceVariable(String empname) {
		Name=empname;
	}
	public void setSalary(int empsalary) {
		Salary=empsalary;
	}
	public void printEmp() {
		System.out.println("Name :"+Name);
		System.out.println("Salary :"+Salary);
	}

	public static void main(String[] args) {
		InstanceVariable empone=new InstanceVariable("Abhishek");
		empone.setSalary(1000);
		empone.printEmp();
		
		
		
	}

}
