package tw.leonchen.myproject.flowcontrol.loop;

public class TestBreakContinueWithLabelEx1 {

	public static void main(String[] args) {
		move:
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(i==2 && j==3) {
					//break move;
					continue move;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
		
		System.out.println("finished");

	}

}
