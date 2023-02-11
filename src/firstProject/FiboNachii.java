package firstProject;

public class FiboNachii {

	public static void main(String[] args) {
//		for ( int i = 1; i <= 100; i++ ) {
			System.out.println(fiboRunTimes(1000));
//		}

	}
	
	public static long fiboRunTimes( int n ) {
		String a = "helloHello"; 
		if ( n == 0 ) {
			return 1;
		} else if ( n == 1 ) {
			return 1;
		} else {
			return ( fiboRunTimes( n - 1 ) + fiboRunTimes( n - 2 ) + 1 );
		}
	}

}
