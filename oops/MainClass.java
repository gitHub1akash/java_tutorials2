package oops;

class Cat{
	boolean hasFur;
	String colour, breed;
	int legs, eyes;
	
	public void walk() {
		System.out.println("cat is walking");
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("my cat has " + legs +" legs and " + eyes + " eyes");
	}
}
class Dog{
	
}

public class MainClass {

	public static void main(String[] args) {
	      
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.walk();
		cat2.eat();
		
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 1;
		
		cat1.description();
		cat2.description();
	}

}
