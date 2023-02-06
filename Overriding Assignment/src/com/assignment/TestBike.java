package com.assignment;

class Bike {
	void bikeInfo(String color, int speed) {
		System.out.println("Color : " + color + " \n Speed : " + speed);
	}
}

class Pulsar extends Bike {
	void bikeInfo(String color, int speed) {
		System.out.println("Pulsar Bike : \n" + "Color : " + color + "\n Speed : " + speed);
	}
}

public class TestBike {

	public static void main(String[] args) {
		Pulsar bike1 = new Pulsar();
		bike1.bikeInfo("Black", 220);

	}

}
