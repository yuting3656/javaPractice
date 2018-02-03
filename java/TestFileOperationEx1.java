package tw.leonchen.myproject.oop.io;

import java.io.File;
import java.io.IOException;

public class TestFileOperationEx1 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp/test/hello.txt");
		
		boolean status = file1.exists();
		
		System.out.println("status:" + status);
		
		if(status) {
			System.out.println("Name:" + file1.getName());
			System.out.println("Parent:" + file1.getParent());
			System.out.println("Path:" + file1.getPath());
			System.out.println("Length:" + file1.length() + " bytes");
			file1.delete();
			System.out.println("File Deleted");
		}else {
			file1.createNewFile();
			System.out.println("File Created");
		}

	}

}
