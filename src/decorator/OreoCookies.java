package decorator;

public class OreoCookies extends Decorator {
	@Override
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 奥利奥");
	}
	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
