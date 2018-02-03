package tw.leonchen.myproject.oop.myabstract;

public class CallTestAbstractEx2 {

	public void processAction(Company corp) {
		corp.calFuel();
		corp.calDistance();
	}
	
	public static void main(String[] args) {
//        Company corp;
//        
//        corp = new Truck();
//        corp.calFuel();
//        corp.calDistance();
//        
//        corp = new Ship();
//        corp.calFuel();
//        corp.calDistance();
		
		CallTestAbstractEx2 abs1 = new CallTestAbstractEx2();
		abs1.processAction(new Truck());
		abs1.processAction(new Ship());
	}

}
