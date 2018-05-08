package lesson3_Prob2;

import java.util.List;

public class Building {
	List<Apartment> apartment;
	double maintainanceCost;

	public Building(List<Apartment> apartment, double maintainanceCost) {
		this.apartment = apartment;
		this.maintainanceCost = maintainanceCost;
	}

	public double totalProfit() {
		double sum = 0.0;
		for (Apartment a : apartment) {
			sum += a.getRent().getAmount();
		}
		double totalProfit = sum - maintainanceCost;
		return totalProfit;
	}

}
