package tw.leonchen.myproject.oop.inheritance;

class Fish{
	String name = "nemo";
	
	public Fish() {		
	}
	
	public Fish(String name) {
		this.name = name;
	}
	
	public void swim() {
		System.out.println(name + " swims in the ocean.");
	}
}

class Shark extends Fish{
	public Shark() {
		super("mary");
	}
	
	public void action() {
		super.name = "michelle";
		super.swim();
		System.out.println("bite something.");
	}
}


public class CallTestInheritanceEx2 {

	public static void main(String[] args) {
		Shark tigerShark = new Shark();
		tigerShark.swim();
		tigerShark.action();
	}

}
