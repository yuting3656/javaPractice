package tw.leonchen.myproject.oop;

public class CallTestVariableScopeEx1 {

	int a=1; //instance variable
	static int b=2;  //static variable
	
	public void f1(int c) {  //local variable
		int d=4;  //local variable
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("d:" + d);
	}
	
	public static void f2(int e) {  //local variable
		//System.out.println("a1:" + a);  //compile error
		System.out.println("b1:" + b);
		//System.out.println("c1:" + c);  //compile error
		//System.out.println("d1:" + d);  //compile error
		System.out.println("e1:" + e);
	}
	
	public static void main(String[] args) {
		CallTestVariableScopeEx1 scope = new CallTestVariableScopeEx1();
		scope.f1(3);
		CallTestVariableScopeEx1.f2(5);
		f2(6);
		//scope.f2(7);
	}

}
