package tw.leonchen.myproject.oop;

public class TestThisEx1 {

	int x;
	int y;

	public void go(int x, int y) {
		this.x = x;  //-> test1.x=6;
		this.y = y;  //-> test1.y=20;
		//System.out.println("this:" + this);
	}

	public static void main(String[] args) {
		TestThisEx1 test1 = new TestThisEx1();
		test1.go(6, 20);
		//System.out.println("test1:" + test1);
		
		System.out.println("test1.x:" + test1.x);
		System.out.println("test1.y:" + test1.y);
	}

}
