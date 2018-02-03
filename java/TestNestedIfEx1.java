package tw.leonchen.myproject.flowcontrol;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		int value = 20;
		
		if(value>=5) {
			System.out.println("value=" + value);
			
			if(value<=15) {
				System.out.println("value*10+1=" + (value*10+1));
			}
			
			System.out.println("section 1");
		}
		
		System.out.println("finished");

	}

}
