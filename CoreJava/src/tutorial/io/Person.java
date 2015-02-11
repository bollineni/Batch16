package tutorial.io;

import java.io.Serializable;
/**
 * Interface witout any methods are known as marker interface.
 * @author Jayram
 *
 */
public class Person implements Serializable {
	private static final long serialVersionUID = -5722357025260802319L;

	private String name;
	private transient int ssn;
	private String address;
	private int height;
	
	public Person(String name, int ssn , String address) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
