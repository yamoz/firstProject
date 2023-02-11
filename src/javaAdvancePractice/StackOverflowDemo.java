package javaAdvancePractice;

public class StackOverflowDemo {
	// heap over flow?
//	public static void main(String[] args) {
//		int[] k = new int[100000000];
////		for ( int i = 0; i < 100000000; i++ ) {
////			k[i] = i;
////		}
//		System.out.println(k[100]);
//	}
	
	// stack over flow
	// https://matthung0807.blogspot.com/2018/03/java-stackoverflowerror.html
	public static void main( String[] args ) {
		recursive(1);
	}
	
	public static int recursive(int num) {
		System.out.println(num);
		if ( num == 6287 )
			return 0;
		recursive(++num);
		return -1;
	}

}
