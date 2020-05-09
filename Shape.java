public abstract class  Shape implements Comparable<Shape>, Zoomable {
	private String name;
	public Shape(String name){
        this.name = name;
	}
	public String getName(){
		return name;
	}
    public abstract double getArea();
    //public abstract double getVolume();

    public int compareTo(Shape e){
		return name.compareTo(e.name);
	}
   }
