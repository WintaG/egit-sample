package lesson3_Prob2;

import java.util.List;

public class Landlord {
	List<Building> bList;

	public Landlord(List<Building> bList) {
		this.bList= bList;
	}
	
	public double totalRent() {
		double sum=0.0;
		for(Building b: bList) {
			sum += b.totalProfit();
		}
		return sum;
	}

}
