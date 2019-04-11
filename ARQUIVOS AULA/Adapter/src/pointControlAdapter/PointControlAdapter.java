package pointControlAdapter;

import actualPointControl.Employee;
import actualPointControl.PointControl;
import newLibraries.NewPointControl;

public class PointControlAdapter extends PointControl {
	
	private NewPointControl newPointControl;

	public PointControlAdapter(int pointControlResponsibleID) {
		super(pointControlResponsibleID);
		this.newPointControl = new NewPointControl(001);
	}
	
	public void registerEntry(Employee employee){
		this.newPointControl.register(employee, true);
	}
	
	public void registerExit(Employee employee){
		this.newPointControl.register(employee, false);
	}

}
