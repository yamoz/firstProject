package extendsExample;

public class ExtendsDemo {
//	String country = "French";
//	protected ExtendsDemo(){
//		System.out.println("run parent constructor");
//	}
//	protected ExtendsDemo( int a ){
//		System.out.println("run parent constructor with int: " + a);
//	}
	private String PVT = "private";
	String DFT = "default"; // could read because in the same package
	protected String PTT = "protected";
	public String PBL = "public";
	
	// 因為private其他class無法讀取，故建立public的getter/setter來存取private
	public String getPVT() {
		return PVT;
	}
	public void setPVT(String pVT) {
		PVT = pVT;
	}
	
}
