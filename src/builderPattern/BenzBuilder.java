package builderPattern;

public class BenzBuilder extends Builder {

	@Override
	public void BuildWheels() {
// TODO Auto-generated method stub
		createCar.setBody("benz的车身");
	}

	@Override
	public void BuildOilBox() {
// TODO Auto-generated method stub
		createCar.setOilbox("benz的邮箱");
	}

	@Override
	public void BuildBody() {
// TODO Auto-generated method stub
		createCar.setWheels("benz的轮子");
	}

}