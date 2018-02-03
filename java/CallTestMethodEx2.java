package tw.leonchen.myproject.oop.method;

class Calculator{
	
	public void plus(int x1, int y1) {
		System.out.println("x1+y1=" + (x1+y1));
	}
	
	public void minus(int x2, int y2) {
		System.out.println("x2-y2=" + (x2-y2));
	}
	
}


public class CallTestMethodEx2 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(6, 3);
		casio.minus(7, 2);
		System.out.println("finished");
	}

}
