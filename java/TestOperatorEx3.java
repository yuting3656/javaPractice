package tw.leonchen.myproject.operator;

public class TestOperatorEx3 {

	public static void main(String[] args) {
		int i=1, j=2, k;
		k=(i++)+(++j);
        System.out.println("i=" + i + " j=" + j + " k=" + k);
	}

}
