package visitor;
//测试类
public class Client {
	public static void main(String[] args) {
		EnginDepartment enginDepartment = new EnginDepartment();
		SaleDepartment saleDepartment = new SaleDepartment();
		EconomyDepartment economyDepartment = new EconomyDepartment();
		Engineer xiaozhang = new Engineer("小张", 5000, 30);
		Engineer xiaowang = new Engineer("小王", 5100, 29);
		enginDepartment.insert(xiaowang);
		enginDepartment.insert(xiaozhang);
		Salesman xiaochen = new Salesman("小陈", 4500, 10);
		Salesman xiaoli = new Salesman("小李", 6000, 5);
		saleDepartment.insert(xiaochen);
		saleDepartment.insert(xiaoli);
		Economist xiaozhou = new Economist("小周", 5000, 25);
		economyDepartment.insert(xiaozhou);
		enginDepartment.show();
		saleDepartment.show();
		economyDepartment.show();
		Employees employees = new Employees();
		employees.attach(xiaozhang);
		employees.attach(xiaowang);
		employees.attach(xiaochen);
		employees.attach(xiaoli);
		employees.attach(xiaozhou);
		IncomeVisitor incomeVisitor = new IncomeVisitor();
		DayVisitor dayVisitor = new DayVisitor();
		employees.accept(incomeVisitor);
		employees.accept(dayVisitor);
	}
}