package decorator;

public class Strawberry extends Decorator {
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 果酱");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
