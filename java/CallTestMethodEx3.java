package tw.leonchen.myproject.oop.method;

class Action{
	public boolean buyIphoneX(int money) {
		System.out.println("Buy IPhoneX Costs NT:" + money);
		return true;
	}
}

public class CallTestMethodEx3 {

	public static void main(String[] args) {
		Action myAction = new Action();
		boolean result = myAction.buyIphoneX(43000);
		System.out.println("result:" + result);
		
		if(result) {
			System.out.println("i got it.");
		}else {
			System.out.println("See you Later.");
		}
	}

}
