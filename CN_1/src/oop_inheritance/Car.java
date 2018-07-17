package oop_inheritance;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	Car(){
		super(100);
		System.out.println("Car");
		
	}
	void Car(){
		System.out.println("Helloe Colo");
	}
	
	public void print(){
		System.out.println("Car color = "+ color);
		System.out.println("Car MaxSpeed = "+ getMaxSpeed() );
		System.out.println("Car Another = "+ numGears +" " + isConvertible);
	}
	
	
	

}
