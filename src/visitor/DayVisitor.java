package visitor;

public class DayVisitor extends Visitor {

	@Override
	public void visit(Employee employee) {
		employee.setDay(employee.getDay() + 500); // 假期增加 3 天
		System.out.println(employee.getName() + "的假期为:" + employee.getDay() + "天");
	}

}
