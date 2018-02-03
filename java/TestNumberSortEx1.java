package tw.leonchen.myproject.oop.array;

public class TestNumberSortEx1 {

	int[] data = { 5, 12, 7, 26, 9 };

	public void sortNumber1() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {

				int temp = 0;
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}
		}
	}

	public void sortNumber2() {
		while (true) {
			
			int count=0;
			
			for (int i = 0; i < data.length - 1; i++) {

				int temp = 0;

				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}

			}
			
			if(count==0) {
				break;
			}
		}
	}

	public void printResult() {
		for (int k = 0; k < data.length; k++) {
			System.out.println(data[k]);
		}
	}

	public static void main(String[] args) {
		TestNumberSortEx1 sort1 = new TestNumberSortEx1();
		// sort1.sortNumber1();
		sort1.sortNumber2();
		sort1.printResult();
	}

}
