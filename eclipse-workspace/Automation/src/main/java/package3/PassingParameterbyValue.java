package package3;

public class PassingParameterbyValue {

	public static void main(String[] args) {
		int a=10;
		int b=29;
		System.out.println("Before swapping: a = " + a + " and b = " + b);
		
		//Invoke the swap method
		swapFunction(a,b);
		//call a method with value.

	}
	//Create a method.
	public static void swapFunction(int a,int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping: a = " + a + " b = " + b);
		
	}

}
