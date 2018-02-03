package tw.leonchen.myproject.oop.nested;

class E{
	private String name = "jack";
	private String skill = "Java";
	
	public void actionNested() {
		int value = 6;
		
		class F{
			public void showDetails() {
				System.out.println("name:" + name);
				System.out.println("skill:" + skill + "-value:" + value);
			}
		}
		
		F f1 = new F();
		f1.showDetails();
	}
}

public class CallTestNestedClassEx3 {

	public static void main(String[] args) {
		E e1 = new E();
        e1.actionNested();
	}

}
