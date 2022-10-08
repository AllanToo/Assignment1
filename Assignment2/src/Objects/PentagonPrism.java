package Objects;
/*
 * represents pentagonal prisms
 * @author Allan To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class PentagonPrism extends Shape {
	// Attributes
	private double side;
	private double radians = Math.toRadians(54.0);

	/*
	 * Initializes a new instance of PentagonPrism object
	 */
	public PentagonPrism() {

	}
	/*
	 * Initializes a new instance of PentagonPrism object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public PentagonPrism(String shape, double height, double side) {
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

	/* @return volume of pentagon prism object */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return ((5 * side * side * Math.tan(radians)) / 4) * this.getHeight();
	}

	/* @return base area of pentagon Prism object */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return (5 * side * side * Math.tan(radians)) / 4;
	}

}
