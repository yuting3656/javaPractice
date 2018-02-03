package tw.leonchen.myproject.oop.method;

class Person{
    public void sayHello() {
    	System.out.println("hello");
    	sayGoodBye();
    }
    
    public void sayGoodBye() {
    	System.out.println("GoodBye");
    	//sayHello();  //runtime error
    }
}

public class CallTestMethodEx1 {

	public static void main(String[] args) {
        Person mike = new Person();
        mike.sayHello();
        //mike.sayGoodBye();
        System.out.println("finished");
	}

}
