package Lab1_Day4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger("Ngáo", 23, "Tiger");
		System.out.println("Tên chú " + tiger.type + ": " + tiger.name + " tuoi " + tiger.age);
		
		Dog dog = new Dog("Cún", 2, "Dog");
		System.out.println("Tên chú " + dog.type + ": " + dog.name + " tuoi " + dog.age);
		
		Elephant elephant = new Elephant("Xu", 23, "Elephant");
		Parrot parrot = new Parrot("Xin", 123, "Parrot");
		
		Animal animal = new Tiger("Ngao", 23, "Tiger");
		System.out.println("Tên chú " + tiger.type + ": " + animal.name + " tuoi " + animal.age);
		

	}

}
