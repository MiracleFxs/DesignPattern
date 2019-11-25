package factory;

public class HPFactory extends AbFactory {

	@Override
	public Laptop CreateLp() {
		return new HP();
	}

}
