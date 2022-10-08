package Compare;

/*this class allows shape objects to compare each other by base area*/
/*@authors @author Allan To, Paul Holck, Justin Gil, Xyrille Tugade*/

import java.util.Comparator;

import Objects.Shape;

public class areaCompare implements Comparator<Shape> {

	/*
	 * compares two shapes by its base area.
	 * 
	 * @param s1 -first shape to be compared
	 * 
	 * @param s2 -second shape to be compared
	 * 
	 * @return integer value. -1 if s1 is less than s2 0 if both shapes are equal 1
	 * if s1 is greater than s2
	 */
	@Override
	public int compare(Shape s1, Shape s2) {
		if (s1.calcBaseArea() > s2.calcBaseArea()) {
			return 1;
		} else if (s1.calcBaseArea() < s2.calcBaseArea()) {
			return -1;
		}

		else
			return 0;
	}
}
