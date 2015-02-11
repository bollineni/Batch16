package tutorial.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteReader {
	
	public static void main(String[] args) {
		
		File inputFile = new File("C:/Users/Jayram/git/Batch16/CoreJava/src/lambdaExpression/Substraction.java");
		File outputFile = new File("HelloWorld.txt");
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader(inputFile);
			out = new FileWriter(outputFile);
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("Done !!!");
		} catch (Exception e) {
		}
	}
}