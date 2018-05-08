package lesson4_C;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public void print() {

	}

	public double getNetPay() {
		return 0.0;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}

	public void setState(double state) {
		this.state = state;
	}

	public void setLocal(double local) {
		this.local = local;
	}

	public void setMedicare(double medicare) {
		this.medicare = medicare;
	}

	public void setSocialSecurity(double socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	@Override
	public String toString() {
		double netSalary = 0.0;
		netSalary = grossPay - (fica + state + local + medicare + socialSecurity);
		return "Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity + "Net Salary: " + netSalary + "]";
	}

}
