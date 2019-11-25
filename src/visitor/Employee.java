package visitor;

public abstract class Employee {
	private String name; // 姓名
	private double pay; // 收入
	private int day; // 假期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public abstract void accept(Visitor visitor);
}
