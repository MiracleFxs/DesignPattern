package bridge;
//测试类
public class Client {

	public static void main(String[] args) {
		Coffee coffee = new SmallCoffee();
		Additives sugar=new Sugar();
		coffee.add(sugar);
		coffee.drink();
	}
}
