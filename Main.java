import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String[] args){
		//polymorhism

		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle("G12", 2.0, 8.0));
		shapes.add(new Rectangle("G13", 3.0, 5.0));
		shapes.add(new Circle("G11", 3.0));

		System.out.println("****** Use default sorting ******");
		Collections.sort(shapes);
		
		double total = 0.0;
		for(Shape shape : shapes){
			total += shape.getArea();
			System.out.printf("Total area = %.2f\n", total);
		}
		System.out.println("****** Use Salary Comparator ******");
		Collections.sort(shapes, new ShapeComparator());
		
		for(Shape shape : shapes){
			total += shape.getArea();
			System.out.printf("Total area = %.2f\n", total);
		}
	}
}