package singleton;
//测试类
public class Client {  
	public static void main(String[] args) {
		AppConfig appConfig1 = AppConfig.GetInstanse();
		appConfig1.setParamaterA("ParaA");
		System.out.println("appconfig1 = " + appConfig1.getParamaterA());
	} 
} 