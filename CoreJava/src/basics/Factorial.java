package basics;

public class Factorial {

	public static void main(String[] args) {
		int value = fact(4);
		System.out.println(value);
	}
	
	static int callMe(int a){
		return a *4;
	}
	static int fact(int n) {
		int result;
		if(n == 1 ){
			return 1;
		}
		result = fact(n-1) * n;
		return result;
	}
}