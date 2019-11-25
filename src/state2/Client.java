package state2;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		StopState stopState = new StopState();
		stopState.doAction(context);
	}

}
