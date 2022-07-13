package View;

import java.util.Comparator;

import Model.Employee;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
