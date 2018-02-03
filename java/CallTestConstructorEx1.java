package tw.leonchen.myproject.oop;

public class CallTestConstructorEx1 {

	public CallTestConstructorEx1(int value) {
		System.out.println("i am constructor:" + value);
	}
	
	public void play() {
		System.out.println("happy play.");
	}
	
	
	public static void main(String[] args) {
		CallTestConstructorEx1 construct = new CallTestConstructorEx1(6);
		construct.play();
		//construct.play();
		
		//anonymous object
		new CallTestConstructorEx1(8).play();
		//new CallTestConstructorEx1(7).play();
		
		
		System.out.println("finished");
		
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);
//		System.out.println("1+1" + (1+1));
	}

}
