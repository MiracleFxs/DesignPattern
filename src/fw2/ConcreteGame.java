package fw2;
//具体游戏类
public class ConcreteGame extends Game {

	private String name;
	public ConcreteGame(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println("运行游戏 "+name);
	}
}
