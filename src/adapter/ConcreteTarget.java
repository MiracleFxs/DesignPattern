package adapter;
//具体目标类，只提供普通功能
public class ConcreteTarget implements Target {

	public void Request() {
		System.out.println("普通类 具有普通功能");
	}

}
