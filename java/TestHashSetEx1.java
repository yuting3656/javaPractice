package tw.leonchen.myproject.oop.collections;

import java.util.HashSet;

public class TestHashSetEx1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		
		set1.add("mary");
		set1.add("mary");
		set1.add("john");
		set1.add(6);
		set1.add(new Integer(6));
		set1.add(3.14);
		
		System.out.println("set1:" + set1);
	}

}
