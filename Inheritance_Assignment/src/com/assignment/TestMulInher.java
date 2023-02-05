package com.assignment;

class AnimalPaltu {
	void eat() {
		System.out.println("Eating.....");
	}
}

class BullDog extends AnimalPaltu {
	void bark() {
		System.out.println("Barking....");
	}
}

class BabyDog extends BullDog {
	void weep() {
		System.out.println("Weeping...");
	}
}

public class TestMulInher {

	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}

}
