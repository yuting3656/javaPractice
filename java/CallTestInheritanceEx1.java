package tw.leonchen.myproject.oop.inheritance;


class Parent{
	String name = "john";
	
	public void walk() {
		System.out.println("walk:" + name);
	}
}

class Child extends Parent{
	
	public void play() {
		System.out.println("Play Games");
	}
	
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "mike";
		child1.walk();
		child1.play();
	}

}
