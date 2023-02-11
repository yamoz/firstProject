package javaAdvancePractice;

import staticblockpractice.StaticBlockPractice;

public class StaticBlockPractice_1 extends StaticBlockPractice {
	
	public int reA() {
		return a;
	}

	static void kick() {
		System.out.println("the child not born yet, but can kick");
	}
	public StaticBlockPractice_1(){
		System.out.println("child constructor");
	}
	{
		System.out.println("non-static block in child");
	}
	static {
		System.out.println("static block in child");
		a++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("被回收了");
	}
}
