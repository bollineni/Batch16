package thread;

public class ThreadExample {

	public static void main(String[] args) {
//		System.out.println("I am beginning..." + Thread.currentThread().getName());
		
		
		PlayFootBall ronaldo = new PlayFootBall();
		
		Thread threadOne = new Thread(ronaldo,"Ronaldo");
		threadOne.start();
		
		Thread threadTwo = new Thread(ronaldo,"Bebeto");
		threadTwo.start();
		
//		System.out.println("Ronaldo's State " + ronaldo.getState());
//		System.out.println("I am done..." + Thread.currentThread().getName());
//		System.out.println("I am done..." + Thread.currentThread().getState());
		
	}
}