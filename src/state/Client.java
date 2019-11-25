package state;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new StateA());

        // 不断地进行请求，同时更改状态
        context.Request();
        context.Request();
        context.Request();
//        context.Request();

	}

}
