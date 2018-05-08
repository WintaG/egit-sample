package lesson4_C;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Order order1 = new Order(1, 2018, 3, 3, 3000);
		Order order2 = new Order(2, 2018, 3, 3, 1000);
		Order order3 = new Order(3, 2018, 3, 3, 1000);

		List<Order> Llist = new ArrayList<>();
		Llist.add(order1);
		Llist.add(order2);
		Llist.add(order3);

		Commissioned com = new Commissioned(0.2, 2000, Llist);

		Hourly hour = new Hourly(300.50, 40);

		Salaried salary = new Salaried(3000);

		Employee[] empArray = { com, hour, salary };
		for (Employee e : empArray) {
			Paycheck paycheck = e.calCompensation(3, 2018);
			System.out.println(paycheck);
		}
	}
}
