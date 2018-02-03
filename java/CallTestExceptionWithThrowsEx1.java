package tw.leonchen.myproject.oop.exception;


class Bird{
	public void fly() throws RuntimeException {
		System.out.println("I can fly high");
	}
}

class BlueBird extends Bird{

	@Override
	public void fly() throws ArithmeticException {
		System.out.println("I can fly fast.");
	}
	
}

public class CallTestExceptionWithThrowsEx1 {

	public static void main(String[] args) {
		Bird bird1 = new BlueBird();
		bird1.fly();
	}

}
