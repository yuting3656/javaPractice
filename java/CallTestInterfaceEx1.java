package tw.leonchen.myproject.oop.myinterface;

interface Flyer{
	public void takeOff();
	public void fly();
	public void land();
}

class Animal{
	public void eat() {
		System.out.println("eat something.");
	}
}

class AirPlane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("AirPlane Takes Off.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlane Fly.");
	}

	@Override
	public void land() {
		System.out.println("AirPlane land.");
	}
	
}

class Bird extends Animal implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Bird Takes Off.");
	}

	@Override
	public void fly() {
		System.out.println("Bird Fly.");
	}

	@Override
	public void land() {
		System.out.println("Bird land.");
	}

	@Override
	public void eat() {
		System.out.println("Bird eats worms.");
	}
	
}

public class CallTestInterfaceEx1 {

	public void processAction(Flyer f) {
		f.takeOff();
		f.fly();
		f.land();
		
		if(f instanceof Bird) {
			Bird b1 = (Bird)f;
			b1.eat();
		}
	}
	
	public static void main(String[] args) {
		CallTestInterfaceEx1 test1 = new CallTestInterfaceEx1();
		test1.processAction(new AirPlane());
		test1.processAction(new Bird());
	}

}
