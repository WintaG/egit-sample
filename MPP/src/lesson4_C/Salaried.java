package lesson4_C;

public class Salaried extends Employee {
	
	private double salary;
	



	public Salaried(double salary) {
		super();
		this.salary = salary;
	}




	public double getSalary() {
		return salary;
	}




	@Override
	public double calcGrossPay(int month, int year) {
		return salary;
	}

}
