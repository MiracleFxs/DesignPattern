package abstrctFactory;

public class KFCfactory extends Factory {

	@Override
	public Hamburg CreateHambury() {
		// TODO Auto-generated method stub
		return new KFCHamburg();
	}

	@Override
	public Cola CreateCola() {
		// TODO Auto-generated method stub
		return new KFCCola();
	}

}
