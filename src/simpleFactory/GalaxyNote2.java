package simpleFactory;

public class GalaxyNote2 extends MobilePhone {
	 
	@Override
	public void Call() {
		System.out.println("用GalaxyNote2打电话");
	}
 
	@Override
	public void SendMSG() {
		System.out.println("用GalaxyNote2发短信");
	}
 
}