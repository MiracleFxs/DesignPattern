package decoratorPattern;
//抽象装饰者，一般为一个抽象类
abstract class Decorator extends Component{
	//必须有一个private变量指向Component抽象构件
	private Component component;
	//通过构造函数传递被修饰者
	public Decorator(Component component)
	{
		this.component=component;
	}
	
	//委托给被修饰者执行
	public void show()
	{
		if(component!=null) {
			component.show();
		}
	}
}