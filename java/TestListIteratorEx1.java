package tw.leonchen.myproject.oop.collections.generic;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("kiwi");
		fruit.add("jack fruit");
		fruit.add("pineapple");
		
		//ListIterator<String> i1 = fruit.listIterator();
		
//		while(i1.hasNext()) {
//			String myFavor = i1.next();
//			System.out.println("myFavor:" + myFavor);
//		}
		
		ListIterator<String> i2 = fruit.listIterator(2);
		while(i2.hasPrevious()) {
			String value = i2.previous();
			System.out.println("value:" + value);
		}
	}

}
