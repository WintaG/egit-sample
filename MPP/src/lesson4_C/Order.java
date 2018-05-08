package lesson4_C;

import java.time.LocalDate;
public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	
	
	public Order(int orderNo,int year, int month,int day,  double orderAmount) {
		this.orderNo = orderNo;
		orderDate = LocalDate.of(year, month, day);
		this.orderAmount = orderAmount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	
	

}
