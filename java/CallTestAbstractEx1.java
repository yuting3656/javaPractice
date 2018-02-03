package tw.leonchen.myproject.oop.myabstract;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
}

class Truck extends Company{

	@Override
	public void calFuel() {
		System.out.println("Truck calculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distance.");
	}
	
}

class Ship extends Company{

	@Override
	public void calFuel() {
		System.out.println("Ship calculates Fuel.");
	}

	@Override
	public void calDistance() {
		System.out.println("Ship calculates Distance.");
	}
	
}

public class CallTestAbstractEx1 {

	public static void main(String[] args) {
		Company corp1 = new Truck();
		corp1.calFuel();
		corp1.calDistance();
		
		Company corp2 = new Ship();
		corp2.calFuel();
		corp2.calDistance();
	}

}
