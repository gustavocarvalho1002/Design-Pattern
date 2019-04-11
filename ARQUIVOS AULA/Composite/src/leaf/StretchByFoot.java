package leaf;

import componente.Stretch;

public class StretchByFoot implements Stretch {
	
	private String direction;
	private double distance;

	public StretchByFoot(String direction, double distance){
		this.direction = direction;
		this.distance = distance;
	}
	
	@Override
	public void printStretch() {
		System.out.println("Go by Foot: ");
		System.out.println(this.direction);
		System.out.println("The completed distance was: " + this.distance + " meters. <- _ _");
	}
	
}
