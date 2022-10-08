package Objects;
/*
 * Superclass of the shapes. It will allow subclasses of the Shape class
 * to inherit the methods, abstract methods and local variables
 * It will also allow the subclasses to compare each other by height.
 * @authors  @author Allan To, Paul Holck, Justin Gil, Xyrille Tugade
 */
public abstract class Shape implements Comparable<Shape> {
	// Attributes
	private double height;
	private String shape;

	/*
	 * Default constructor
	 */
	public Shape() {

	}
	
	/*
	 * construct shape object with 2 parameters
	 * 
	 * @param String subclass of shape
	 * 
	 * @param double value of height
	 */
	public Shape(String shape, double height) {
		this.shape = shape;
		this.height = height;
	}
// Getters and Setters

	/*
	 * retrieve height from shape object.
	 * 
	 * @return height of the object
	 */
	public double getHeight() {
		return height;
	}

	/*
	 * change value of height from shape object. set height of the object
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/*
	 * retrieve Shape name from shape object.
	 * 
	 * @return shape name of the object
	 */
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}


	public abstract double calcVolume();

	public abstract double calcBaseArea();

	@Override
	/*
	 * Compare two shape object by their height
	 * 
	 * @param Shape object
	 * 
	 * @return integer value. if shape1 > shape2, return 1
	 * if shape1 < shape2, return -1
	 * if equal, return 0
	 */public int compareTo(Shape s) {
		if (this.getHeight() > s.getHeight())

			return 1;

		else if (this.getHeight() < s.getHeight())

			return -1;

		else
			return 0;

	}

}
