package Objects;
/**
 * represents cylinder
 * @author Allan To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class Cylinder extends Shape {
	// Attributes
	private double radius;

	/*
	 * Initializes a new instance of Cylinder object
	 */	
	public Cylinder() {

	}
	/**
	 * Initializes a new instance of Cylinder object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public Cylinder(String shape, double height, double radius) {
		super(shape, height);
		this.radius = radius;
	}

	
	/**
	 * @return returns the radius of this object 
	 * */
	public double getRadius() {
		return radius;
	}
	/* 
	 * set new value to radius of this object
	 * */
	public void setRadius() {
		this.radius = radius;
	}
	/** @return volume of Cylinder object */
	@Override
	public double calcVolume() {

		return Math.PI * radius * radius * this.getHeight();
	}

	/** @return base area of cylinder object */
	@Override
	public double calcBaseArea() {

		return Math.PI * radius * radius;
	}
}
