package tw.leonchen.myproject.oop.nested;

class Shark{
	String name = "Tiger Shark";
	
	public void eat() {
		System.out.println("Seal");
	}
}

class GreyShark extends Shark{
	
	@Override
	public void eat() {
		System.out.println("Fish");
	}
}

public class CallTestNestedClassEx4 {

	public static void main(String[] args) {
		GreyShark shark = new GreyShark();
		shark.eat();
		
		new Shark() {			
			@Override
			public void eat() {
				System.out.println("Vegetables");
			}			
		}.eat();
		
	}

}
