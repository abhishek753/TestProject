package package3;

public class Teststatic {
    static int a=10;
	public static void main(String[] args) {
		Teststatic obj=new Teststatic();
		Teststatic obj1=new Teststatic();
		System.out.println("obj.a value:"+obj.a);
		System.out.println("obj1.a value:"+obj1.a);
		obj.a=20;
		System.out.println("obj.a Value:"+obj.a);
		System.out.println("obj1.a Value:"+obj1.a);
		

	}

}
