package Objects;

/**
 * represents square prism
 * @author Allen To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class SquarePrism extends Shape {
	// Attributes 
	private double side;

	/*
	 * Initializes a new instance of SquarePrism object
	 */	
	public SquarePrism()
	{
		
	}
	/**
	 * Initializes a new instance of SquarePrism object
	 * @param shape name
	 * @param double value of height
	 * @param double value of side
	 */	
	public SquarePrism(String shape, double height, double side)
	{
		super(shape, height);
		this.side = side;
	}
	
	
	/** 
	 * @return returns the side of this object 
	 * */
	public double getSide()
	{
		return side;
	}
	/**
	 * set new value to side of this object
	 * */
	public void setSide()
	{
		this.side = side;
	}
	
	/** @return base area of Square Prism object */
	@Override
	public double calcBaseArea() {
		
		return side * side;
	}
	
	/** @return volume of Square Prism object */
	@Override
	public double calcVolume() {
		
		return side * side * this.getHeight();
	}
	
}
