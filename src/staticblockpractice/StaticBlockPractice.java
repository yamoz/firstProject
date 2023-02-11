package staticblockpractice;

public class StaticBlockPractice {
	protected static int a = 0;
	protected int b = 10;
	StaticBlockPractice(){
		System.out.println("parents constructor");
	}
	{
		System.out.println("non-static block in parents");
	}
	static {
		
		System.out.println("static block in parents");
	}
}
