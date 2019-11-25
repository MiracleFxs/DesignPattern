package factory;

public class LenovoFactory extends AbFactory {

	@Override
	public Laptop CreateLp() {
		// TODO Auto-generated method stub
		return new Lenovo();
	}

}
