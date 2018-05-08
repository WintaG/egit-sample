package lesson4_C;

import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	List<Order> order;

	public Commissioned(double commission, double baseSalary, List<Order> order) {
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.order = order;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		double sum = 0.0;
		for (Order o : order) {
			if (o.getOrderDate().getMonthValue() == month && o.getOrderDate().getYear() == year) {
				sum += o.getOrderAmount();
			}
		}
		return baseSalary + sum * commission;
	}

	public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrder() {

		return order;
	}

}
