package tw.leonchen.myproject.flowcontrol;

public class TestSwithCaseEx1 {

	public static void main(String[] args) {
		int level = 35;

		switch (level) {
		  case 5:
			System.out.println("stick");
			break;
		  case 10:
			System.out.println("short sword");
			break;
		  case 20:
			System.out.println("pistal");
			break;
		  case 35:
			System.out.println("Rifle");
			break;
		  case 50:
			System.out.println("RPG");
			break;
		  default:
			System.out.println("Your hand");
			break;
		}
		
		System.out.println("Play Game.");

	}

}
