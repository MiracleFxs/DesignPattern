package abstrctFactory;

public class MHfactory extends Factory {

	@Override
	public Hamburg CreateHambury() {
		// TODO Auto-generated method stub
		return new McHamburg();
	}

	@Override
	public Cola CreateCola() {
		// TODO Auto-generated method stub
		return new McCola();
	}

}
