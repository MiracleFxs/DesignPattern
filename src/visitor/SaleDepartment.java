package visitor;

import java.util.ArrayList;
import java.util.List;

public class SaleDepartment {
	private List<Salesman> salesman = new ArrayList<Salesman>();

	public void insert(Salesman saleman) // 添加工程师
	{
		salesman.add(saleman);
	}

	public void delete(Salesman saleman) // 删除工程师
	{
		salesman.remove(saleman);
	}

	public void show() // 显示所有工程师信息
	{
	for (int i = 0; i < salesman.size(); i++) {
	System.out.println("工业设计部:" + salesman.get(i).getName() + " 薪资为:" + salesman.get(i).getPay() + " 假期为:"
	+ salesman.get(i).getDay());
	}
	}
}
