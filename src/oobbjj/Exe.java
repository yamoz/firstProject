package oobbjj;

public class Exe {

	public static void main(String[] args) {
//		Objjj a = new Objjj();
//		Objjj b = new Objjj();
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		BigUniqueRng ranSet = new BigUniqueRng(100000, 100000000);
		for ( int i = 0; i < 50; i++ ) {
			int ranNum = ranSet.next();
			System.out.println(ranNum);
		}
	}

}
