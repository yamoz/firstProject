package polymorphism;

public class Penguin extends Animal {
	void sleep() {
		System.out.println("Penguin sleep on ice");
	}
	void move() {
		System.out.println("Penguin move by swim.");
	}
	void eat() {
		System.out.println("Penguin eat fish.");
	}
}
