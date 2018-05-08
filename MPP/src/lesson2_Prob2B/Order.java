package lesson2_Prob2B;

import java.util.ArrayList;
import java.util.List;


public class Order {
	private int orderNum;
	List<Orderline> orderline;
	
	public Order(int order) {
		orderNum = order;
		orderline= new ArrayList<Orderline>();
	}
	public int getOrderNum() {
		return orderNum;
	}
	
	public List<Orderline> getOrderline() {
		return orderline;
	}
	
	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + "]";
	}
	public static void main(String[] args) {
		Orderline oLine= new Orderline();
		System.out.println(oLine.getOrder());
	}

}
