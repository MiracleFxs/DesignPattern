package decorator;

public class ChocolateChip extends Decorator {
	public void BaseIce() {
		super.BaseIce();
		System.out.println(" 巧克力");
	}

	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return super.Money()+2;
	}
}
