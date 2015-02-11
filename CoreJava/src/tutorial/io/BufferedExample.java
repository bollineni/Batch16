package tutorial.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedExample {

	public static void main(String[] args) {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("HelloWorld.txt")));
//			reader.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
