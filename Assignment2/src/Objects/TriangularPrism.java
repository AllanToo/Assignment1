package Objects;
/*
 * represents triangle prisms
 * @author Allen To, Paul Holck, Justin Gil, Xyrille Tugade
 * */
public class TriangularPrism extends Shape {
	// Attributes 
		private double side;
		/*
		 * Initializes a new instance of TriangularPrism object
		 */	
		public TriangularPrism(){}
		/*
		 * Initializes a new instance of TriangularPrism object
		 * @param shape name
		 * @param double value of height
		 * @param double value of side
		 */	
		public TriangularPrism(String shape, double height, double side)
		{
			super(shape, height);
			this.side = side;
		}
		
		/* 
		 * @return returns the side of this object 
		 * */
		public double getSide()
		{
			return side;
		}
		/* 
		 * set new value to side of this object
		 * */
		public void setSide()
		{
			this.side = side;
		}

		/* @return volume of Triangular Prism object */
		@Override
		public double calcVolume() {
			// TODO Auto-generated method stub
			return  ((side * side * Math.sqrt(3.0)) / 4) * this.getHeight();
		}
		
		/* @return base area of triangular Prism object */
		@Override
		public double calcBaseArea() {
			// TODO Auto-generated method stub
			return ( side * side * Math.sqrt(3.0)) / 4;
		}
}
