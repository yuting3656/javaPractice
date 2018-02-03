package tw.leonchen.myproject.oop.overload;

public class CallTestOverloadEx1 {

	public void plus(int x1, int y1) {
		System.out.println("x1+y1=" + (x1+y1));
	}
	
	public void plus(double x2, double y2) {
		System.out.println("x2+y2=" + (x2+y2));
	}
	
	public static void main(String[] args) {
		CallTestOverloadEx1 overload = new CallTestOverloadEx1();
		overload.plus(3, 5);
		overload.plus(3.14, 6.28);
		overload.plus('A', 65.12);
	}

}
