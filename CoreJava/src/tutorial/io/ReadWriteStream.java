package tutorial.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteStream {
	
	public static void main(String[] args) {
		
		File inputFile = new File("C:/Users/Jayram/git/Batch16/CoreJava/src/lambdaExpression/Substraction.java");
		File outputFile = new File("HelloWorld.txt");
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(inputFile);
			out = new FileOutputStream(outputFile);
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Done !!!");
		} catch (Exception e) {
		}
	}
}