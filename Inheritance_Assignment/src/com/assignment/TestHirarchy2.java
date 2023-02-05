package com.assignment;

class PetAnimal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogy extends PetAnimal {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends PetAnimal {
	void meow() {
		System.out.println("meowing...");
	}
}

class TestHirarchy2 {

	public static void main(String[] args) {

		Cat blacky = new Cat();
		blacky.meow();
		blacky.eat();
	}

}
