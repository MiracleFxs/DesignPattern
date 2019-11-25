package simpleFactory;

public class SFMain {
	 
	public static void main(String[] args) {
        MobilePhone ph;
        ph = SimpleFactory.CreatePhone("Iphone4S"); //用户需要的手机通过调用工厂的方法去生产
        ph.Call();
        ph.SendMSG();
	}
 
}