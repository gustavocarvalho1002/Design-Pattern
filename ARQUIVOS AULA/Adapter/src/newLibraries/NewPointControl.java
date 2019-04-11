package newLibraries;

import java.util.Calendar;
import java.text.SimpleDateFormat;

import actualPointControl.Employee;

public class NewPointControl {
	
	int pointControlResponsibleID;
	
	public NewPointControl(int pointControlReponsibleID){
		this.pointControlResponsibleID = pointControlResponsibleID;
	}

	public void register(Employee employee, boolean isEntry){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDataFormat = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = simpleDataFormat.format(calendar.getTime());
		
		if(isEntry == true){
			System.out.println("Entrada: " + employee.getName() + " às " + format);
		} else{
			System.out.println("Saída: " + employee.getName() + " às " + format);		
		}		
	}
}
