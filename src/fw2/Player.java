package fw2;
//外部状态类 玩家名字
public class Player {
	private String Pname;
	public Player(String name) {
		this.Pname=name;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

}
