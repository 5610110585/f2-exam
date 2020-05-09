public class Circle extends Shape implements AreaCalculable{	//concrete class
	private double radius;

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI * radius * radius;
	}

	public static void main(String[] args){
		Circle c = new Circle("G11", 3.0);
		System.out.println("Area of " +  c.getName() + " is " + c.getArea());
	}
}