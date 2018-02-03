package tw.leonchen.myproject.oop;

class Vehicle{
	public void move() {
		System.out.println("move");
	}
}

public class TestEqualsEx1 {

	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();  //car1:0x1234 -> 0x2345
		Vehicle car2 = new Vehicle();  //car2:0x2345
		
		System.out.println("(car1==car2):" + (car1==car2));
		System.out.println("(car1.equals(car2)):" + (car1.equals(car2)));
		
		car1 = car2;
		
		System.out.println("(car1==car2)_1:" + (car1==car2));
		System.out.println("(car1.equals(car2))_1:" + (car1.equals(car2)));
	}

}
