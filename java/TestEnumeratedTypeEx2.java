package tw.leonchen.myproject.oop.enumeratedtype;

enum weather{
	rainy, sunny("heavy"), cloudy, stormy;
	
	private String status = "light";
	
	weather(){
		System.out.println("good day.");
	}
	
	private weather(String status) {
		this.status = status;
	}
	
	public void showInfo() {
		System.out.println("status:" + status);
	}
}

public class TestEnumeratedTypeEx2 {

	public static void main(String[] args) {
		weather type = weather.sunny;
		System.out.println("type:" + type);
		type.showInfo();
	}

}
