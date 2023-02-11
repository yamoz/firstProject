package extendsExample;

public class ExtendsDemo_main extends ExtendsDemo{

	public static void main(String[] args) {
		ExtendsDemo_main output = new ExtendsDemo_main();
//		System.out.println(output.PVT);
		System.out.println(output.getPVT());
		System.out.println(output.DFT); // could run because in the same class of parents
		System.out.println(output.PTT);
		System.out.println(output.PBL);
		
//		output.bornCountry();
	}

}
