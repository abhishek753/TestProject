package package3;

public class MethodDemo {
public static void main(String[] args) {
	int a=11;
	int b=556;
	int c= minFunction(a,b);  // Calling the method which is created- min.
	System.out.println("Minimum Value is: "+c);
}

	//Create a method min.
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1>n2) {
			min=n2;
		}else
		{
			min=n1;
		}
		return min;
		
	}
}
