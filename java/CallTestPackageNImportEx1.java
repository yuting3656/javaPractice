package tw.leonchen.myproject.oop.mypackage;

import javax.swing.JButton;
import javax.swing.JFrame;

import tw.leonchen.myproject.oop.TestPackageNImportEx1;

public class CallTestPackageNImportEx1 {

	public static void main(String[] args) {
		TestPackageNImportEx1 test1 = new TestPackageNImportEx1();
		test1.sayHi();
		test1.sayGoodBye();
		
//		JFrame f = new JFrame("title");
//		f.add(new JButton("Press Me"));
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setSize(300, 400);
//		f.setVisible(true);
	}

}
