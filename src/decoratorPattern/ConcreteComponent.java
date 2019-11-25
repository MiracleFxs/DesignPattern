package decoratorPattern;

//具体构件
class ConcreteComponent extends Component{

	private String name;
	public ConcreteComponent(String name) {
		this.name=name;
	}
    //具体实现
	public void show() {
		System.out.print("装扮的"+name);
	}
	
}