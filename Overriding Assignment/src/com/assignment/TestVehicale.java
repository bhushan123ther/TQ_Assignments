/*3)WAP to create class Vehicle with methods accelerate(long mph) with long type parameter ,stop(),run() all method return string type of value. Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/

package com.assignment;

class Vehicle {
	void accelerate(long mph) {
		System.out.println("Speed " + mph + " min per hour");
	}

	String stop() {
		return "Stop the vehicle..";
	}

	String run() {
		return "Vehicle running..";
	}
}

class Car extends Vehicle {
	void accelerate(long mph) {
		System.out.println("Car speed " + mph + " min per hours");
	}
}

public class TestVehicale {

	public static void main(String[] args) {
		Car swift = new Car();
		swift.accelerate(50);
		swift.stop();
	}

}
