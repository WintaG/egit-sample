package lesson3_Prob3_1;

public class Cylinder extends Circle{
	private double height= 1.0;

	public Cylinder() {
		super();

	}
	public Cylinder(double radius) {
		super(radius);

	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return Math.PI * this.getRadius()* this.getRadius() * height;
	}
	
	public static void main(String[] args) {
	  Circle c1= new Circle();
	  System.out.println(c1.getArea());
	  
	  Cylinder cy= new Cylinder();
	  System.out.println(cy.getVolume());
	}
 
}
