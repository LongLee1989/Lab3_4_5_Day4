package Lab2_Day4;

abstract class Shape {
	public String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	abstract double getArea();
	
	public String toString() {
		return "Màu Đen";
	}
}
