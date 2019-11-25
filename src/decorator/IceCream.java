package decorator;

public class IceCream extends Component {
	@Override
	public void BaseIce() {
		System.out.println(" 冰激凌");
	}
	@Override
	public int Money() {
		return 10;
	}
}
