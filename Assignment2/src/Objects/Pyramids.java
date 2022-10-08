package Objects;
/*
 * represents pyramid.
 * @author Allen To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class Pyramids extends Shape {
	// Attributes
	private double side;

	/*
	 * Initializes a new instance of Pyramid object
	 */	
	public Pyramids() {

	}
	/*
	 * Initializes a new instance of Pyramids object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public Pyramids(String shape, double height, double side) {
		super(shape, height);
		this.side = side;
	}

	/* 
	 * @return returns the side of this object 
	 * */
	public double getSide() {
		return side;
	}
	/* 
	 * set new value to side of this object
	 * */
	public void setSide() {
		this.side = side;
	}

	@Override
	/* @return base area of pyramid object */
	public double calcBaseArea() {

		return side * side;
	}

	/* @return volume of pyramid object */
	@Override
	public double calcVolume() {

		return (1 / 3) * Math.PI * side * side * this.getHeight();
	}

}
