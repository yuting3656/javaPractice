package tw.leonchen.myproject.hw;

public class TestSquareRootsHw {

	public static void main(String[] args) {
		int a=1, b=3, c=1;
		
		int judge = b*b-4*a*c;
		
		if(judge>=0) {
			System.out.println("Has Real Roots");
			double x1  = (-b+Math.sqrt(judge))/(2*a);
			double x2  = (-b-Math.sqrt(judge))/(2*a);
			
			System.out.println("x1:" + x1);
			System.out.println("x2:" + x2);
			
		}else {
			System.out.println("No Real Roots");
		}

	}

}
