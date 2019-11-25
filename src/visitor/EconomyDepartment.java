package visitor;

import java.util.ArrayList;
import java.util.List;

public class EconomyDepartment {

	private List<Economist> economists = new ArrayList<Economist>();

	public void insert(Economist economist) // 添加工程师
	{
		economists.add(economist);
	}

	public void delete(Economist economist) // 删除工程师
	{
		economists.remove(economist);
	}

	public void show() // 显示所有工程师信息
	{
	for (int i = 0; i < economists.size(); i++) {
	System.out.println("工业设计部:" + economists.get(i).getName() + " 薪资为:" + economists.get(i).getPay()
	+ " 假期为:" + economists.get(i).getDay());
	}
	}
}
