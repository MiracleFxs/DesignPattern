package state2;

public class StartState implements State {
	public void doAction(Context context) {
		System.out.println("灯是开的");
		context.setState(this);
	}
}