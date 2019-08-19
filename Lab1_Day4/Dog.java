package Lab1_Day4;

public class Dog extends Animal{
	
	public String type;

	public Dog(String nameDog, int ageDog, String type) {
		super(nameDog, ageDog);
		this.type = type; // thêm 1 thuộc tính khác so vs Animal
		// TODO Auto-generated constructor stub
	}

}
