package state2;

public class StopState implements State {
	public void doAction(Context context) {
		System.out.println("灯是关的");
		context.setState(this);
	}
}