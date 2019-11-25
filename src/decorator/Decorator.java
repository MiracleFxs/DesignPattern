package decorator;
//抽象装饰类
public class Decorator extends Component {
	protected Component component;
	public void Decorate(Component component) 
    {
        this.component = component;
    }
	@Override
	public void BaseIce() {
        if (component != null)
        {
    		component.BaseIce();
        }
	}
	@Override
	public int Money() {
		// TODO Auto-generated method stub
		return component.Money();
	}
}
