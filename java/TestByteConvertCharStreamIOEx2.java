package tw.leonchen.myproject.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Please Input Your Name:(use Q or q to exit)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/yourSecret.txt")));
		
		String data;
		while((data=br1.readLine())!=null) {
			
			if("Q".equalsIgnoreCase(data)) {
				bw1.flush();
				bw1.close();
				br1.close();
				System.out.println("System Closed");
				System.exit(-1);
			}
			
			System.out.println(data);
			bw1.write(data + " : " + new Date());
			bw1.newLine();
		}

		
	}

}
