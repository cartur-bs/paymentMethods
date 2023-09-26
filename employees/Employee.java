package employees;

public class Employee {
	private String name;
	protected double workedHours;
	protected double amountPerHour;
	protected double salary;

	public Employee(String name, double workedHours, double amountPerHour) {
		this.name = name;
		this.workedHours = workedHours;
		this.amountPerHour = amountPerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double getAmountPerHour() {
		return amountPerHour;
	}

	public void setAmountPerHour(double amountPerHour) {
		this.amountPerHour = amountPerHour;
	}

	public double getSalary() {
		return salary;
	}

	public double Salary() {
		return  workedHours * amountPerHour;
	}
}
