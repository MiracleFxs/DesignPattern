package factory;

public class AcerFactory extends AbFactory {

	@Override
	public Laptop CreateLp() {
		// TODO Auto-generated method stub
		return new Acer();
	}

}
