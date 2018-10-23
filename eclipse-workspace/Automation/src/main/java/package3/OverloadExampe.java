package package3;

public class OverloadExampe {
	public static void disp() {
		System.out.println("disp() method without parameter.");
	}
	public static void disp(String name) {
		System.out.println("disp() method with parameter."+name);
	}
	public static void main(String[] args) {
		OverloadExampe.disp();
		OverloadExampe.disp("Abhishek");
		
	}

}
