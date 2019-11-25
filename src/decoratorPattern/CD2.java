package decoratorPattern;

public class CD2 extends Decorator{

	public CD2(Component component) {
		super(component);
		System.out.print("cd2 ");
	}

}