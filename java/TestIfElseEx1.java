package tw.leonchen.myproject.flowcontrol;

public class TestIfElseEx1 {

	public static void main(String[] args) {
		
		int yourLuckyNumber = 1;
		
		int richNumber = (int)(Math.random()*6+1);
		System.out.println("richNumber:" + richNumber);
		
		if(yourLuckyNumber==richNumber) {
			System.out.println("You Win !!");
		}else {
			System.out.println("Try Agian !!");
		}
		
		System.out.println("see you next time.");

	}

}
