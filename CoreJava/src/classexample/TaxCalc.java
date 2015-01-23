package classexample;

public class TaxCalc {
	private int wage;
	private int numberOfHours;
	
	public TaxCalc(int wage , int noh) {
		this.wage = wage;
		this.numberOfHours = noh;
	}
	
	public int calculateTax() {
		return (wage + 1)* numberOfHours; 
	}
	
	public static int calTax(int wage , int numberOfHrs) {
		return (wage + 1)* numberOfHrs; 
	}
}
