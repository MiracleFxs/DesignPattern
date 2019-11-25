package singleton;

class AppConfig {
	private static AppConfig config;
	private String paramaterA;//参数
	public String getParamaterA() {
		return paramaterA;
	}
	public void setParamaterA(String paramaterA) {
		this.paramaterA = paramaterA;
	}
	//私有化构造方法
	private AppConfig() {
	}
	public static AppConfig GetInstanse() {
		if (config == null) {
			config = new AppConfig();
		}
		return config;
	}
}