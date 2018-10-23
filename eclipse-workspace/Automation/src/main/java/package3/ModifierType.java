package package3;

public class ModifierType 
{



	private static int myFlag = 5; //Visible to the class only (private).
	public static int c =9; //Visible to the world (public).
	protected static final int BoxWidht=49; //Visible to the package and all subclasses (protected).
	static int b = 101; //Visible to the package, the default. No modifiers are needed.

	public static void main(String[] args) 
	{
		
      System.out.println("c"+c);
      System.out.println("myFlag"+myFlag);
      System.out.println("BoxWidht"+BoxWidht);
      System.out.println("b: "+b);
		}

}	
