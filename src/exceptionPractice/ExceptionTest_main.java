package exceptionPractice;

public class ExceptionTest_main {

	public static void main(String[] args) {
		Scooter yamaha_force = new Scooter();
		try {
			yamaha_force.ride(200);
			yamaha_force.ride(50);
		} catch ( outOfOilException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("the scooter doesn't have enough oil for that distance.");
		} 
//		finally {
//			return; // finally內有return可消除try產生的exception
//		}
	}

}
