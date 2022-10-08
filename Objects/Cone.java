package Objects;
/**
 * represents cone
 * @author Allan To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class Cone extends Shape {
	// Attributes
	private double radius;

	/*
	 * Initializes a new instance of Cone object
	 */	
	public Cone() {

	}
	/**
	 * Initializes a new instance of Cone object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public Cone(String shape, double height, double radius) {
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

	/** @return volume of Cone object */
	@Override
	public double calcVolume() {

		return (1 / 3) * Math.PI * radius * radius * this.getHeight();
	}

	/** @return base area of cone object */
	@Override
	public double calcBaseArea() {

		return Math.PI * radius * radius;
	}
}
