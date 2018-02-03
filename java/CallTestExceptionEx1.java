package tw.leonchen.myproject.oop.exception;

public class CallTestExceptionEx1 {

	public void f(int x, int y) {
		try {
			System.out.println("x/y=" + (x / y));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("hello");
			System.out.println("e1:" + e);
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("e2:" + e);
			System.exit(-1);
		} catch (Exception e) {
			System.out.println("e3:" + e);
		} finally {
			System.out.println("always run here.");
		}
	}

	public static void main(String[] args) {
		CallTestExceptionEx1 except1 = new CallTestExceptionEx1();
		except1.f(6, 0);
	}

}
