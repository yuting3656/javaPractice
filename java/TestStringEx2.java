package tw.leonchen.myproject.oop;

public class TestStringEx2 {

	public static void main(String[] args) {
		String data = "mary*john*louis*michelle*maron";
		String[] values = data.split("\\*");
		
		for(String name:values) {
			System.out.println("name:" + name);
		}
	}

}
