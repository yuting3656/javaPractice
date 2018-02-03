package tw.leonchen.myproject.oop;

public class TestStringEx1 {

	public static void main(String[] args) {
		String data = "abcdefghabcdefgh";
		System.out.println("Length:" + data.length());
        System.out.println("data.charAt(5)=" + data.charAt(5));
        System.out.println("data.substring(3, 5)=" + data.substring(3, 5));
        System.out.println("data.toUpperCase()=" + data.toUpperCase());
        System.out.println("data.indexOf('gh')=" + data.indexOf("gh"));
        System.out.println("data.lastIndexOf('gh')=" + data.lastIndexOf("gh"));
	}

}
