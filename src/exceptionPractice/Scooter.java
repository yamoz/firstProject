package exceptionPractice;

public class Scooter {
	private double oil = 5; // 公升
	
	void ride( double kilometer ) throws outOfOilException { // 當沒油時丟出exception
		double oilConsume = kilometer / 50;
		if ( oil - oilConsume <= 0 ) {
			throw new outOfOilException();
//			throw new outOfOilException("the scooter's oil is not enough to ride that range.");
		} else {
			oil -= oilConsume;
		}
	}
}
