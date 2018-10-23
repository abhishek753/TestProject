package package3;


//Java program to demonstrate different 
//ways of initializing a final variable 
class FinalVariable {

	// a final variable 
    // direct initialize 
	final int Thresold=10;
	
	  // a blank final variable 
	final int Capacity;
	
	// another blank final variable 
	final int Minimum;
	
	 // a final static variable PI 
    // direct initialize
	static final double PI=3.57;
	
	// a  blank final static  variable 
	static final double Eulerconstant;
	
	// instance initializer block for  
    // initializing CAPACITY 
	{
		Capacity=15;
	}
	 // static initializer block for  
    // initializing EULERCONSTANT 
	static {
		Eulerconstant=1.5;
	}
	// constructor for initializing MINIMUM 
    // Note that if there are more than one 
    // constructor, you must initialize MINIMUM 
    // in them also
	public FinalVariable() {
		Minimum=-1;
	}

}
