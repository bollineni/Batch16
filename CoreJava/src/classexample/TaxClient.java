package classexample;

public class TaxClient {

	public static void main(String[] args) {
		TaxCalc tc = new TaxCalc(23,200);
		System.out.println(tc.calculateTax());
		System.out.println(TaxCalc.calTax(23, 200));
		System.out.println(Math.abs(200));
	}
}