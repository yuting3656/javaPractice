package tw.leonchen.myproject.oop.nested;

class A{
	
	private String name = "mary";
	
	class B{
		public void sayHello() {
			System.out.println("hi," + name);
		}
	}
	
	public void processNested() {
		B b1 = new B();
		b1.sayHello();
	}
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
        A a1 = new A();
        a1.processNested();
        
        A.B b2 = a1.new B();
        b2.sayHello();
        
        System.out.println("finished");
	}

}
