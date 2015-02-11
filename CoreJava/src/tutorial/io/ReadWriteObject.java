package tutorial.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {

	public static void main(String[] args) {
		try {
			/*FileOutputStream outputFile = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(outputFile);
			Person per = new Person("Sundar",34567,"Alaska");
			oos.writeObject(per);
			oos.close();
			System.out.println("Writing is done...");*/
			
			FileInputStream inputFile = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(inputFile);
			Person savedPerson = (Person)ois.readObject();
			
			System.out.println(savedPerson.getName() +" " + savedPerson.getSsn());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception exp) {
			exp.printStackTrace();
		}
	}
}