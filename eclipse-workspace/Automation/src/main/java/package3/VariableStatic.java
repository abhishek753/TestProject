package package3;

public class VariableStatic {
	/*static*/ String studentName;
	/*static*/ int age;
	public String getstudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void disp() {
		System.out.println("Student Name :"+studentName+"Age :"+age);
	}
	
	public static void main(String[] args) {
	VariableStatic obj=new VariableStatic();
	obj.setStudentName("Abhishek");
	obj.setAge(27);
	VariableStatic obj1=new VariableStatic();
	obj.disp();
	obj1.disp();

	}

}
