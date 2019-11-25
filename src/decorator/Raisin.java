package decorator;

public class Raisin extends Decorator {
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 葡萄干");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
