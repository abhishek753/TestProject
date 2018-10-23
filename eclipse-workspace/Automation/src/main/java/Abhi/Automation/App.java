package Abhi.Automation;

/**
 * Hello world!
 *
 */
class App 
{
	int i;
	{
		System.out.println("Class A SIB");
	}
	{
		System.out.println("Class A IIB");
	}
	App(){
		System.out.println("Class A Constructor");
	}
}
class B extends App
{
	int j;
}
class Inherit
{
	public static void main(String[] args) {
		B b = new B();
	}
	
}
    

	