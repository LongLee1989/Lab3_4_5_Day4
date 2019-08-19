package Lab2_Day4;

public class Rectangle extends Shape{
	
	private int lenght;
	private int width;
	
	public Rectangle(String color, int lenght, int width) {
		super(color);
		this.lenght = lenght;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return lenght*width;
	}
	
	public String toString() {
		return color;
	}

}
