package lesson3_Prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Rent rent1 = new Rent(100);
		Rent rent2 = new Rent(200);
		Rent rent3 = new Rent(300);

		Apartment apt1 = new Apartment(rent1);
		Apartment apt2 = new Apartment(rent2);
		Apartment apt3 = new Apartment(rent3);

		List<Apartment> aList = new ArrayList<>();
		aList.add(apt1);
		aList.add(apt2);
		aList.add(apt3);

		Building b1 = new Building(aList, 200);

		Apartment apt11 = new Apartment(rent1);
		Apartment apt22 = new Apartment(rent2);
		Apartment apt33 = new Apartment(rent3);

		List<Apartment> sList = new ArrayList<>();
		sList.add(apt11);
		sList.add(apt22);
		sList.add(apt33);

		Building b2 = new Building(sList, 100);
		List<Building> bList = new ArrayList<>();
		bList.add(b1);
		bList.add(b2);
		Landlord ld = new Landlord(bList);

		System.out.println(ld.totalRent());

	}
}