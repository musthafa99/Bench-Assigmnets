package Inhetiance;

public class Cyclinder extends Circle {
	private double height;

	   public Cyclinder() {
	      super();  
	      this.height = 1.0;
	      System.out.println("Constructed a Cylinder with Cylinder()");  
	   }
	   public Cyclinder(double height) {
	      super();  
	      this.height = height;
	      System.out.println("Constructed a Cylinder with Cylinder(height)");  
	   }
	   public Cyclinder(double height, double radius) {
	      super(radius);  
	      this.height = height;
	      System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  
	   }
	   public Cyclinder(double height, double radius, String color) {
	      super(radius, color);  
	      this.height = height;
	      System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  
	   }

	   public double getHeight() {
	      return this.height;
	   }
	   public void setHeight(double height) {
	      this.height = height;
	   }
	   public double getVolume() {
	      return super.getArea()*height;   
	   }
	   public String toString() {
	      return "This is a Cylinder";
	   }
}