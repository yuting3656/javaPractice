package tw.leonchen.myproject.oop;

public class TestEqualsEx2 {

	public static void main(String[] args) {
		//String str1 = new String("hello");  //str1:0x1234
		String str1 = "hello";  //str1:0x3456 (as namespace1)
		
		//String str2 = new String("hello");  //str1:0x2345
		//String str2 = "hello";  //str2:0x3456 (as namespace1)
		String str2 = "Hello";  //str2:0x4567 (as namespace2)
		
		System.out.println("(str1==str2)=" + (str1==str2));
		System.out.println("(str1.equals(str2))=" + (str1.equals(str2)));
	}

}
