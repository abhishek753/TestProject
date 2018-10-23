package javaclass;



class Democlass {
	int i;
	static {
		System.out.println("");
	}
	{
		System.out.println("");
	}
	Democlass()
	{
		System.out.println("");
	}
}
class b extends Democlass
{
	int j;
}
class Mainclass
{
	public static void main(String[] args) {
		b B=new b();
	}
	

}
