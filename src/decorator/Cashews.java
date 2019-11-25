package decorator;

public class Cashews extends Decorator {
	@Override
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 腰果");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
