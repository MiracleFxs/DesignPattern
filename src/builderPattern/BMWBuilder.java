package builderPattern;

public class BMWBuilder extends Builder {

	@Override
	public void BuildWheels() {
// TODO Auto-generated method stub
		createCar.setWheels("bmw的车轮");
	}

	@Override
	public void BuildOilBox() {
// TODO Auto-generated method stub
		createCar.setOilbox("bmw的油箱");
	}

	@Override
	public void BuildBody() {
// TODO Auto-generated method stub
		createCar.setBody("bmw的车身");
	}

}