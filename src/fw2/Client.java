package fw2;
//客户端
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFactory f = new GameFactory();

        Game zs = f.GetGameCategory("斗地主");
        zs.run();
        Game ls = f.GetGameCategory("斗地主");
        ls.run();
        Game ww = f.GetGameCategory("斗地主");
        ww.run();
        Game zl = f.GetGameCategory("麻将");
        zl.run();
        Game sq = f.GetGameCategory("麻将");
        sq.run();
        Game zb = f.GetGameCategory("麻将");
        zb.run();
       System.out.println("游戏种类"+f.GetGameCount());
       
//       Player player=new Player("玩家1");
//       zb.show(player);
	}

}
