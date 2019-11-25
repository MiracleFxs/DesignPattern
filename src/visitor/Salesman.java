package visitor;

public class Salesman extends Employee {

	public Salesman(String name, double pay, int day) {
		setName(name);
		setPay(pay);
		setDay(day);
		}

	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
