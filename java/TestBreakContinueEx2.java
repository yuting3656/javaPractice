package tw.leonchen.myproject.flowcontrol.loop;

public class TestBreakContinueEx2 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			
			if(i==5) {
				break;
				//continue;
			}
			
			System.out.println("i=" + i);
			i++;
		}
		
		System.out.println("finished");

	}

}
