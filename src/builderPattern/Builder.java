package builderPattern;

public abstract class Builder {
	Car createCar = new Car();

	public abstract void BuildWheels();

	public abstract void BuildOilBox();

	public abstract void BuildBody();

	public Car GetCar() {
		return createCar;
	}

}