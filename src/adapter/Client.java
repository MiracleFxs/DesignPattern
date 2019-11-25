package adapter;
//客户端
public class Client {
	public static void main(String[] args) {
        // 使用普通功能类
        Target concreteTarget = new ConcreteTarget();//实例化一个普通类
        concreteTarget.Request();

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.Request();

	}

}
