package visitor;

import java.util.ArrayList;
import java.util.List;

public class Employees {
	private List<Employee> employees = new ArrayList<Employee>();

	public void attach(Employee employee) // 添加表彰员工
	{
		employees.add(employee);
	}

	public void detach(Employee employee) // 删除表彰员工
	{
		employees.remove(employee);
	}

	public void accept(Visitor visitor) // 奖励员工
	{
		for (int i = 0; i < employees.size(); i++) {
			employees.get(i).accept(visitor);
		}
	}
}
