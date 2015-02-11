package tutorial.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		int size = 0;
		char[] charArray = new char[100];
		try{
			File file = new File("HelloWorld.txt");
//			fw = new FileWriter(file);
//			fw.write("Good Morning/Evening folks...");
//			fw.flush();
			
			fr = new FileReader(file);
			size = fr.read(charArray);
			System.out.println("Size is " + size);
			
			for(char c : charArray) {
				System.out.print(c);
			}
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		}
	}
}
