package firstProject;

import javaAdvancePractice.*;

public class HelloWorld {

	public void man(String[] args) {
		char a = 0x2200;
//		a >>= 1;
		System.out.println(a);
		System.out.println((int)a);
		System.out.println(a>>1);
		System.out.println(a>>>1);
		System.out.println(Integer.toHexString((int)a));
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a>>1));
		System.out.println(Integer.toBinaryString(a>>>1));
		ClassConcept ip6 = new ClassConcept();

	}

}
