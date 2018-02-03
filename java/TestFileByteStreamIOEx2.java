package tw.leonchen.myproject.oop.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt");
		
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt");  //1.
		//FileOutputStream fos1 = new FileOutputStream("c:/temp/test/destination.txt", true);  //1.
		
		int data;
		while((data=fis1.read())!=-1) {
			System.out.print((char)data + "");
			fos1.write(data);  //2.
		}

		fos1.close();  //3.
		fis1.close();
	}

}
