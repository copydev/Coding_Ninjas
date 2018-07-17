package oop_inheritance;

import Generics.PrintInterface;

public class Vehicle implements PrintInterface {
	String color;
	private int maxSpeed;
	public Vehicle(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	void Vehicle(){
		System.out.println("Hello orange");
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	public void print(){
		System.out.println("Vehicle color: " + color);
		System.out.println("Vehicle Max Speed: " + maxSpeed);
	}

}
