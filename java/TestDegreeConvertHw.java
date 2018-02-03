package tw.leonchen.myproject.hw;

public class TestDegreeConvertHw {

	public static void main(String[] args) {
		int index=2, degree=78;
		
		if(index==1) {
			System.out.println("c->f");
			
			double degreeF = degree*9/5.0+32;
			System.out.println("degreeF:" + degreeF);
		}

		if(index==2) {
			System.out.println("f->c");
			double degreeC = (degree-32)*5/9.0;
			System.out.println("degreeC:" + degreeC);
		}
	}

}
