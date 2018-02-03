package tw.leonchen.myproject.oop.array;

public class TestEnhancedForEx2 {

	public static void main(String[] args) {
		int[][] data = {{1,2,3},{4,5,6,7,8,9,10}};

		for(int[] nums: data) {
			for(int value:nums) {
				System.out.println("value:" + value);
			}
		}
	}

}
