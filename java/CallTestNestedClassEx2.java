package tw.leonchen.myproject.oop.nested;


class C{
	private static int age = 18;
	
	static class D{
		public void happy() {
			System.out.println("happy age:" + age);
		}
	}
}

public class CallTestNestedClassEx2 {

	public static void main(String[] args) {
        C.D d1 = new C.D();
        d1.happy();
	}

}
