package Lab2_Day4;

public class Main {
	public static void main(String[] args) {
		
		processShape("Rectangle");
		processShape("Triangle");
		
	}
	
	public static void processShape(String Shape) {
		
		switch (Shape) {
		case "Rectangle":
			Rectangle();
			break;
		case "Triangle":
			Triangle();
			break;
		default:
			break;
		}
		
	}
	
	private static void Triangle() {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle("Trắng", 10, 10);
		
		System.out.println("Màu Triangle: " + triangle.toString());
		
		System.out.println("Dien tich Triangle: " + triangle.getArea());
	}

	private static void Rectangle() {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle("Xanh", 10, 10);
		
		System.out.println("Màu Rectangle: " + rectangle.toString());
		
		System.out.println("Dien tich Rectangle: " + rectangle.getArea());
		
	}
	
	

	
}
