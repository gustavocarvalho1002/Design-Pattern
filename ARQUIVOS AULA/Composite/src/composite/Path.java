package composite;

import java.util.ArrayList;
import java.util.List;

import componente.Stretch;

public class Path implements Stretch {
	
	private List <Stretch> stretches = new ArrayList <Stretch>();
	
	public void addStretch(Stretch stretch){
		this.stretches.add(stretch);
	}
	
	public void removeStretch(Stretch stretch){
		this.stretches.remove(stretch);
	}
	
	@Override
	public void printStretch() {
		for(Stretch stretch : this.stretches){
			stretch.printStretch();
		}
	}
}
