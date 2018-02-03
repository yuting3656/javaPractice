package tw.leonchen.myproject.hw;

public class TestFibonacciSequenceHw {

	public long f(int n) {

		if ((n - 1) == 0 || (n - 2) == 0) {
			return (n - 1);
		}

		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {
		TestFibonacciSequenceHw fibo = new TestFibonacciSequenceHw();
		for (int i = 1; i <= 48; i++) {
			long num = fibo.f(i);
			System.out.println(i + ". " + num);
		}
	}

}
