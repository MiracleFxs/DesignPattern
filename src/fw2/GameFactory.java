package fw2;

import java.util.Hashtable;
public class GameFactory {
	private Hashtable<String, Game> fw = new Hashtable<String, Game>();
    //获得游戏分类
    public Game GetGameCategory(String key)
    {
        if (!fw.contains(key))
            fw.put(key, new ConcreteGame(key));
        return (Game)fw.get(key);
    }

    //获得游戏分类总数
    public int GetGameCount()
    {
        return fw.size();
    }
}
