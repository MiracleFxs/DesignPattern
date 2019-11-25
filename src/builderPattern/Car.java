package builderPattern;
//汽车类
public class Car {
	private String wheels;
	private String oilbox;
	private String body;

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getOilbox() {
		return oilbox;
	}

	public void setOilbox(String oilbox) {
		this.oilbox = oilbox;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void show() {
		System.out.println(wheels);
		System.out.println(oilbox);
		System.out.println(body);
	}
}