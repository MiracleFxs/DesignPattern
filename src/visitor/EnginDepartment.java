package visitor;

import java.util.ArrayList;
import java.util.List;

public class EnginDepartment {
	private List<Engineer> engineers = new ArrayList<Engineer>();

	public void insert(Engineer engineer) // 添加工程师
	{
		engineers.add(engineer);
	}

	public void delete(Engineer engineer) // 删除工程师
	{
		engineers.remove(engineer);
	}

	public void show() // 显示所有工程师信息
	{
	for (int i = 0; i < engineers.size(); i++) {
	System.out.println("工业设计部:" + engineers.get(i).getName() + " 薪资为:" + engineers.get(i).getPay() + " 假期为:"
	+ engineers.get(i).getDay());
	}
	}
}