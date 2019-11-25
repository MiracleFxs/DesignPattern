package builderPattern;
//指挥者
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void CreateCar() {
		builder.BuildBody();
		builder.BuildOilBox();
		builder.BuildWheels();
	}
}
