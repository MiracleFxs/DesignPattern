package simpleFactory;

public class Iphone4S extends MobilePhone {
	 
	@Override
	public void Call() {
		System.out.println("用iPhone4s打电话");
	}
 
	@Override
	public void SendMSG() {
		System.out.println("用iPhone4s发短信");
	}
 
}