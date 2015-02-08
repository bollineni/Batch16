package thread;

public class PlayFootBall extends Games implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// System.out.println(Thread.currentThread().getName()+ " "+
			// Thread.currentThread().getState()+ " >>> "+i);
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
