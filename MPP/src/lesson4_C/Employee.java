package lesson4_C;

public abstract class Employee {
	private int empid;

	public void print() {

	}

	public Paycheck calCompensation(int month, int year) {
		Paycheck paycheck = new Paycheck();
		double grossPayment = calcGrossPay(month, year);
		double fica = grossPayment*0.23;
		double state = grossPayment*0.05;
		double local = grossPayment*0.01;
		double medicare = grossPayment*0.03;
		double socSec = grossPayment*0.075;
		paycheck.setGrossPay(grossPayment);
		paycheck.setFica(fica);
		paycheck.setState(state);
		paycheck.setLocal(local);
		paycheck.setMedicare(medicare);
		paycheck.setSocialSecurity(socSec);
		return paycheck;

	}

	public abstract double calcGrossPay(int month, int year);

	public int getEmpid() {
		return empid;
	}
}
