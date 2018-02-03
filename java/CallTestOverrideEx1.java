package tw.leonchen.myproject.oop.override;


class Animal{
	public void eat() {
		System.out.println("Eat Food.");
	}
}

class Lion extends Animal{	
	
	public void eat() {
		System.out.println("Lion eats Meat.");
	}
	
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Lion lionKing = new Lion();
		lionKing.eat();
	}

}
