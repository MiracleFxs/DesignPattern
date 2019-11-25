package decorator;

public class Pecan extends Decorator {
	@Override
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 核桃");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
