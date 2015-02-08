package thread.deadlock;

public class DeadLockSituation {
	public static String bike = "BIKE";
	public static String helmet = "HELMET";
	
	public static void main(String[] args) {
		Thread tommy = new TommyThread();
		tommy.setName("Tommy");
		tommy.start();
		
		Thread harry = new HarryThread();
		harry.setName("Harry");
		harry.start();
	}
	private static class TommyThread extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				System.out.println(getName() +" Holds Lock on "+ bike);
				System.out.println(getName() +" is waiting on "+ helmet);
				synchronized(helmet) {
					System.out.println(getName()+" Has got both bike and helmet to ride");
				}
				System.out.println("Ending the bike ride for " + getName());
			}
		}
	}
	private static class HarryThread extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				System.out.println(getName() +" Holds Lock on "+ bike);
				System.out.println(getName() +" is waiting on "+ helmet);
				synchronized(helmet) {
					System.out.println(getName()+" Has got both bike and helmet to ride");
				}
				System.out.println("Ending the bike ride for " + getName());
			}
		}
	}
}

