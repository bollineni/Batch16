package lambdaExpression;

public class CalculationClient {

	public static void main(String[] args) {
		Calculation cal1 = new Addition();
		System.out.println(cal1.calc(5, 3));

		Calculation cal3 = new Addition();
		System.out.println(cal3.calc(5, 6));

		
		Calculation cal2 = new Addition(){
			@Override
			public int calc(int a, int b) {
				return a + b + 1;
			}
		};
		System.out.println(cal2.calc(7, 3));
		
		Calculation sub = new Substraction();
		System.out.println(sub.calc(7, 2));
		
		Calculation substract = (a , b) -> a - b;
		System.out.println(substract.calc(7, 2));
		
		Calculation div = (a , b) -> a / b;
		System.out.println("Division Value = " + div.calc(10, 2));
		
	}
}