package tw.leonchen.myproject.oop.array;

public class TestVarArgsEx1 {

	public void sum(int... data) {  //-> int[] data = values; -> int[] data = {3,4,5,6,7};
		int total=0;
		
		for(int num: data) {
			total = total + num;
		}
		
		System.out.println("total:" + total);
	}
	
	public static void main(String[] args) {
		TestVarArgsEx1 varArgs = new TestVarArgsEx1();
		varArgs.sum(1,2,3,4,5,6,7,8,9,10);
		varArgs.sum();
		
		int[] values = {3,4,5,6,7};
		varArgs.sum(values);
	}

}
