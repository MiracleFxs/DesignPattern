package adapter;

public class Adapter extends Adaptee implements Target {

	@Override
	public void Request() {
		super.specificRequest();
	}

}
