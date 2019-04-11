package leaf;

import componente.Stretch;

public class StretchByCar implements Stretch {
	
	private String direction;
	private double distance;

	public StretchByCar(String direction, double distance){
		this.direction = direction;
		this.distance = distance;
	}
	
	@Override
	public void printStretch() {
		System.out.println("Go by Car: ");
		System.out.println(this.direction);
		System.out.println("The completed distance was: " + this.distance + " meters. <- 0-0");
	}
	
}
