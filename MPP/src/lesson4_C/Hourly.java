package lesson4_C;

public class Hourly extends Employee {
	private double hourlyWage;
	private int hoursPerWeek;

	
	
	public Hourly(double hourlyWage, int hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}



	@Override
	public double calcGrossPay(int month, int year) {
		return 4* hoursPerWeek * hourlyWage;
	}
}
