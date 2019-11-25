package decorator;

public class Almond extends Decorator {
	@Override
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 杏仁");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
