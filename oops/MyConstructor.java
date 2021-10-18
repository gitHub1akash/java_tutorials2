package oops;

class Vehicle {
	
	int wheels;
	int headlights;
	String color;
	
	Vehicle(){
		
	}
	Vehicle(int wheels){
		this.wheels = wheels;
		headlights = 2;
	}
	
	Vehicle(int wheels, String color){
		this.wheels = wheels;
		this.color = color;
	}
	
}

public class MyConstructor {
	
	MyConstructor(){
		System.out.println("the objectis now created");
	}

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, "yellow");
		
		Vehicle random =new Vehicle();
		
		System.out.println(eRikshaw.wheels+ " wheels and color =" + eRikshaw.color);
		
		System.out.println(car.headlights);
	}

}
