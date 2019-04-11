package actualPointControl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PointControl {
	
	int pointControlResponsibleID;
	
	public PointControl(int pointControlResponsibleID){
		this.pointControlResponsibleID = pointControlResponsibleID;
	}
	
	public void registerEntry(Employee employee) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Entrada: " + employee.getName() + " às " + format);
	}
	
	public void registerExit(Employee employee) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Saída: " + employee.getName() + " às " + format);
	}

}
