package employees;

public class Outsourced_employee extends Employee{

	private double additionalCharge;
	
	public Outsourced_employee(String name, double workedHours, double amountPerHour, double additionalCharge) {
		super(name, workedHours, amountPerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double Salary() {
		return  super.Salary() + additionalCharge * 1.1;
	}
	
}
