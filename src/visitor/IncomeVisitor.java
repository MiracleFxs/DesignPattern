package visitor;

public class IncomeVisitor extends Visitor {
	public void visit(Employee employee) {
		employee.setPay(employee.getPay() + 500);
		System.out.println(employee.getName() + "的薪资为:" + employee.getPay());
	}
}