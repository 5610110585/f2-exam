public class Rectangle extends Shape implements AreaCalculable{	//concrete class
	private double width;
	private double height;

	public Rectangle(String name, double width, double height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getArea(){
		return width * height;
    }
    
    public void zoom(double factor){
		width = width * factor;
		height = height * factor;
	}


	public static void main(String[] args){
		Rectangle c = new Rectangle("G12", 2.0, 8.0);
		System.out.println("Area of " + c.getName() + " is " + c.getArea());
	}
}