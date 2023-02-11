package javaAdvancePractice;

public class ClassConcept {
	public ClassConcept(){
		System.out.println("new obj created");
	}
	
	public ClassConcept( int a ) {
		System.out.println("obj with value");
	}
	static int recycleAmount = 0;
	static int supportMonthes = 36;
	int price = 1000;
	String brand = "APPLE";
	String smartphone;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("手機被回收了");
		recycleAmount++;
	}
	
	// overload
	public static int add( int a, int b ) {
		System.out.println("return int:");
		return a + b;
	}
	public static double add ( double a, double b ) {
		System.out.println("return double:");
		return a + b;
	}
}
