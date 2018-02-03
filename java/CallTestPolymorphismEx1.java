package tw.leonchen.myproject.oop.polymorphism;

class Mammal {
	public static void play(Mammal m) { // Mammal m = snoopy; -> Mammal m = new Dog();
		m.happy();                      // Mammal m = kitty; -> Mammal m = new Cat();

		if (m instanceof Dog) {
			Dog d1 = (Dog) m;
			d1.biteBall();
		}

		if (m instanceof Cat) {
			Cat c1 = (Cat) m;
			c1.jumpAway();
		}
	}

	public void happy() {
		System.out.println("happy.");
	}
}

class Dog extends Mammal {

	public void happy() {
		System.out.println("Wong Wong Happy.");
	}

	public void biteBall() {
		System.out.println("Dog bites Ball.");
	}

}

class Cat extends Mammal {

	@Override
	public void happy() {
		System.out.println("Mouw Mouw Happy");
	}

	public void jumpAway() {
		System.out.println("Cat jumps away.");
	}

}

public class CallTestPolymorphismEx1 {

	public static void main(String[] args) {
		Dog snoopy = new Dog();
		Mammal.play(snoopy);

		Cat kitty = new Cat();
		Mammal.play(kitty);

	}

}
