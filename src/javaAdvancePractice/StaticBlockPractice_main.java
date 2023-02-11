package javaAdvancePractice;

public class StaticBlockPractice_main {
	/**
	 * refer to https://matthung0807.blogspot.com/2019/04/java-static-blocknon-static-block.html
	 */
	public static void main(String[] args) {
//		staticblockpractice.StaticBlockPractice_1.kick(); // static method
//		System.out.println(StaticBlockPractice_1.a); // static variable
		System.out.println("==============================================");
		new StaticBlockPractice_1();
		System.out.println("==============================================");
		StaticBlockPractice_1 soccer = new StaticBlockPractice_1();
//		System.gc();
//		for ( int i = 1; i <= 10000; i++) {
//			System.out.print("*");
//		}
//		System.out.println(StaticBlockPractice_1.);
		System.out.println(soccer.reA());
	}

}
