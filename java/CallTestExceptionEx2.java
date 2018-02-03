package tw.leonchen.myproject.oop.exception;

public class CallTestExceptionEx2 {

	private int[] data = {1,2,3,4,5,6};
	
	public void printArray() throws ArrayIndexOutOfBoundsException, Exception {
		for(int i=0;i<=data.length;i++) {
			System.out.println("data[" + i + "]=" + data[i]);
		}
	}
	
	public static void main(String[] args) { //throws Exception{
		CallTestExceptionEx2 except2 = new CallTestExceptionEx2();
		try{
			except2.printArray();
		}catch(Exception e) {
			System.out.println("e:" + e);
		}
	}

}
