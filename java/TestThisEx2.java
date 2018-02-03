package tw.leonchen.myproject.oop;

public class TestThisEx2 {

	int level = 1;
	
	public TestThisEx2() {
		this(10);
		System.out.println("TestThisEx2()");
	}
	
	public TestThisEx2(int level) {
		this.level = level;
	}
	
	public static void main(String[] args) {
		TestThisEx2 test1 = new TestThisEx2();
		System.out.println("test1.level:" + test1.level);
	}

}
