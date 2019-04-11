//import actualPointControl.Employee;
import pointControlAdapter.PointControlAdapter;
import actualPointControl.*;

public class PointControlTest {

	public static void main(String[] args) throws InterruptedException {
		PointControl pointControl = new PointControl (001);
		//PointControl pointControl = new PointControlAdapter(001);
		Employee employee = new Employee("Milene Serrano");
		pointControl.registerEntry(employee);
		Thread.sleep(3000);
		pointControl.registerExit(employee);
	}

}
