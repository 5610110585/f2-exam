import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape>{
	public int compare(Shape e1, Shape e2){
		return new Double(e1.getArea()).compareTo(e2.getArea());
	}
}