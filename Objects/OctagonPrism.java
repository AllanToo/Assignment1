package Objects;
/**
 * represents octagonal prisms
 * @author Allen To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class OctagonPrism extends Shape {
	// Attributes
	private double side;

	/*
	 * Initializes a new instance of OctagonPrism object
	 */
	public OctagonPrism() {

	}
	/**
	 * Initializes a new instance of OctagonPrism object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public OctagonPrism(String shape, double height, double side) {
		super(shape, height);
		this.side = side;
	}

	/** 
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

	/** @return volume of octagon Prism object */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return (2 * (1 + Math.sqrt(2.0)) * side * side) * this.getHeight();
	}

	/** @return base area of octagon Prism object */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2 * (1 + Math.sqrt(2.0)) * side * side;
	}

}
