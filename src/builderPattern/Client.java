package builderPattern;
//客户端类
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car;
		Builder builder = new BenzBuilder();
		Director dir = new Director(builder);
		dir.CreateCar();
		car = builder.GetCar();
		car.show();
	}
}
