package tw.leonchen.myproject.flowcontrol.loop;

public class TestDiceEx2 {

	public static void main(String[] args) {
		int yourLuckyNumber = 4;

		int count=0;
		
		while (true) {

			int richNumber = (int) (Math.random() * 6 + 1);
			System.out.println("richNumber:" + richNumber);

			if (yourLuckyNumber == richNumber) {
				count++;
				if(count==2) {
					System.out.println("You Win !!");
					break;
				}
				
			} else {
				System.out.println("Don't Leave me alone !!");
			}

		}

	}

}
