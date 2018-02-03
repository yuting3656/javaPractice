package tw.leonchen.myproject.oop.io;

class MyResource implements AutoCloseable{

	public void processResource() {
		System.out.println("Processing Resource.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed.");
	}
	
}

public class CallTestAutoCloseableEx1 {

	public static void main(String[] args) {
		try(MyResource resource = new MyResource()){
			resource.processResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
