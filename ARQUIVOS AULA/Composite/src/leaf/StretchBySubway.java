package leaf;

import componente.Stretch;

public class StretchBySubway implements Stretch {
	
	private String direction;
	private double distance;

	public StretchBySubway(String direction, double distance){
		this.direction = direction;
		this.distance = distance;
	}
	
	@Override
	public void printStretch() {
		System.out.println("Go by Subway: ");
		System.out.println(this.direction);
		System.out.println("The completed distance was: " + this.distance + " meters. <- ===");
	}
	
}
