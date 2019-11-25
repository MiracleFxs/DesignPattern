package decoratorPattern;

public class Client {

	public static void main(String args[]) {

		Component xc = new ConcreteComponent("小小");

		Component cd1 = new CD1(xc);
//		Component cd2 = new CD2(cd1);
//		cd2.show();

	}
}
