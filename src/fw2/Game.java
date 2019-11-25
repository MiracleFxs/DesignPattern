package fw2;

//抽象享元类
public abstract class Game {
	public abstract void run();
	public void show(Player player) {
		System.out.print(player.getPname());
		this.run();
	}
}
