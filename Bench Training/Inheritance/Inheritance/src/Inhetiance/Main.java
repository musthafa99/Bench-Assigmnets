package Inhetiance;

public class Main {
	public static void main(String[] args) {
	      Cyclinder cy1 = new Cyclinder();
	      System.out.println("Radius is " + cy1.getRadius()
	         + ", Height is " + cy1.getHeight()
	         + ", Color is " + cy1.getColor()
	         + ", Base area is " + cy1.getArea()
	         + ", Volume is " + cy1.getVolume());
	      Cyclinder cy2 = new Cyclinder(5.0, 2.0);
	      System.out.println("Radius is " + cy2.getRadius()+ ", Height is " + cy2.getHeight() + ", Color is " + cy2.getColor() + ", Base area is " + cy2.getArea()+ ", Volume is " + cy2.getVolume());
	}
}