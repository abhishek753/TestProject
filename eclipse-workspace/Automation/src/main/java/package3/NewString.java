package package3;

public class NewString {

	public static void main(String[] args) {
		
		//Example for Create the String.
	char[] HelloArray= {'A','B','H','I','S','H','E','K'};
	String HelloString=new String(HelloArray);
	
	System.out.println(HelloString);
		
		//Example for String Buffer.
		StringBuffer sBuffer=new StringBuffer("NewString");
		sBuffer.append(" String Buffer");
		System.out.println(sBuffer);
		
		//This use for reverse the String.
		StringBuffer Buffer=new StringBuffer("nitin");
		Buffer.reverse();
		System.out.println(Buffer);
		
		// Find the String Length.
		String Pailndrome=new String("Abhishek");
		int len=Pailndrome.length();
		System.out.println("This is the Length of String: "+len);
		
		//This is an Example for add two String.
		String add=new String("I Love You");
		System.out.println("Neha "+add);

		//This is an Example for Format the String.
		String F;
		F=String.format("Hello" + " 4526895");
		System.out.println(F);
		
		//This is an Example for give the Index value within the String.
		String Str = new String("Welcome to Tutorialspoint.com");
	      System.out.print("Found Index :" );
	      System.out.println(Str.indexOf( '.' ));
	      
	      //This is an Example for Find the Length of Array and String.
	      String[] str = new String [3];
	      str[0]="Hello";
	      str[1]="Abhishek";
	      str[2]="Sharma";
	      System.out.println(str[2].length());
	      System.out.println(str.length);
	      
	      
	      int[] Array= {121,45,59,77,88,909};
	      
	      
	      System.out.println(Array);
	
	}
	
}
