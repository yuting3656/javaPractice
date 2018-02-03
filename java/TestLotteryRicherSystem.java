package tw.leonchen.myproject.hw;

public class TestLotteryRicherSystem {

	int[] count = new int[42];
	int[] number = new int[42];
	
	public void createLotteryNumber() {
		for (int i = 1; i <= 100000; i++) {
			int rNum = (int) (Math.random() * 42) + 1;
			//System.out.println("rNum=" + rNum);
			
			count[rNum-1]++; //count[rNum-1] = count[rNum-1]+1;
		}
		
		for(int j=1;j<=42;j++) {
			number[j-1]=j;
		}
	}
	
	
	public void sortNumber1() {
		for (int i = 0; i < count.length - 1; i++) {
			for (int j = i + 1; j < count.length; j++) {

				int temp1 = 0, temp2 = 0;
				if (count[i] < count[j]) {
					temp1 = count[i];
					count[i] = count[j];
					count[j] = temp1;
					
					temp2 = number[i];
					number[i] = number[j];
					number[j] = temp2;
				}

			}
		}
	}
	
	
	public void printResult() {
		for(int m=0;m<count.length;m++) {
			System.out.printf("%d:%d\n", number[m], count[m]);
		}
	}

	public static void main(String[] args) {
		TestLotteryRicherSystem richerSystem = new TestLotteryRicherSystem();
		richerSystem.createLotteryNumber();
		
		System.out.println("Original Data:");
		System.out.println("------------------------------");
		richerSystem.printResult();
		System.out.println("------------------------------");
		
		richerSystem.sortNumber1();
		
		System.out.println("Sorted Data:");
		System.out.println("------------------------------");
		richerSystem.printResult();
		System.out.println("------------------------------");
	}

}
