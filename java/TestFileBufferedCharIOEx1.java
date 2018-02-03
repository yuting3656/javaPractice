package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileBufferedCharIOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("c:/temp/test/source.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		
		String data;
		while((data=br1.readLine())!=null) {
			System.out.println(data);
		}
		
		br1.close();
		fr1.close();

	}

}
