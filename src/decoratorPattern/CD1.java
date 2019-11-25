package decoratorPattern;

public class CD1 extends Decorator{

	public CD1(Component component) {
		super(component);
		System.out.print("cd1 ");
	}

}
