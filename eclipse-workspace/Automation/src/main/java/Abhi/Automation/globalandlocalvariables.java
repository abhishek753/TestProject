package Abhi.Automation;

 class globalandlocalvariables {
	 
	 static int globalVariables;
	 
	 static void methodOne()
	 {
		 int localToMethodOne=1;
		 System.out.println(localToMethodOne);
		 System.out.println(globalVariables);
		 //System.out.println(localToMain);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int LocalToMain=2;
		System.out.println(LocalToMain);
		System.out.println(globalVariables);
		//System.out.println(localToMethodOne);
	}

}
