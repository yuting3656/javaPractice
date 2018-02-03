package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
		//InputStream is = System.in;
		//InputStreamReader isr1 = new InputStreamReader(is);
		//BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String data;
		while((data=br1.readLine())!=null) {
			
			if("Q".equalsIgnoreCase(data)) {
				br1.close();
				System.out.println("System Closed");
				System.exit(-1);
			}
			
			System.out.println(data);
		}

		
	}

}
