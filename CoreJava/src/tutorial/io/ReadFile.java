package tutorial.io;

import java.io.File;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("HelloWorld.txt");
		boolean isFileCreated;
		System.out.println(file.exists());
		try {
			isFileCreated = file.createNewFile();
			System.out.println("isFileCreated "+ isFileCreated);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(file.getAbsolutePath());
	}
}