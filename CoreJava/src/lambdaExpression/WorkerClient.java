package lambdaExpression;

public class WorkerClient {

	public static void main(String[] args) {
		/*WorkerInterface worker = new Labour();
		worker.working();
		*/
		WorkerInterface newLabour = () -> {
			System.out.println("I am a labour");
			System.out.println("I work hard...");
		};
		newLabour.working();
	}
}