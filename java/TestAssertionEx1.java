package tw.leonchen.myproject.oop.exception;

public class TestAssertionEx1 {

	public static void main(String[] args) {
		int a=6, b=0;
		
		assert b!=0:"b=" +b;
		
		System.out.println("a/b=" + (a/b));

	}

}
