package firstProject;

public class CallByValueReferenceTest {

	public static void main(String[] args) {
		int x = 10;
		some(x);
		System.out.println(x);
	}
	private static void some( int y ) {
		y = 100;
	}

}
