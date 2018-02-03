package tw.leonchen.myproject.oop.exception;

class MyOwnException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String server = "DeepBlue";
	private int port = 1000;
	private String msg = "System Fail";

	public MyOwnException(String server, int port, String msg) {
		this.server = server;
		this.port = port;
		this.msg = msg;
	}
	
	public void showDeatils() {
		System.out.println("Server:" + server);
		System.out.println("Port:" + port);
		System.out.println("Message:" + msg);
	}
}

public class CallTestMyOwnExceptionEx1 {

	public static void main(String[] args) {
        int code = 26;
        
        if(code%2==0) {
        	try {
				throw new MyOwnException("blade", 12345, "virus attack");
			} catch (MyOwnException e) {
				System.out.println("System Error Information");
				e.showDeatils();
			}
        }else {
        	System.out.println("System Operating Normal.");
        }
	}

}
