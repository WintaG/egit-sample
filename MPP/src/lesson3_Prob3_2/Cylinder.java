package lesson3_Prob3_2;

public class Cylinder {
	private double height= 1.0;
	Circle c;

	public Cylinder() {

	}
	public Cylinder(Circle c) {
		this.c= c;
	}
	
	public Cylinder(double height, Circle c) {
		this.height = height;
		this.c= c;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return Math.PI * c.getRadius() * c.getRadius() * height;
	}
	
	public static void main(String[] args) {
	  Circle c1= new Circle();
	  System.out.println(c1.getArea());
	  
	  Cylinder cy= new Cylinder(new Circle());
	  System.out.println(cy.getVolume());
	}

}
