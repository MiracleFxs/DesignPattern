package decorator;
//客户端测试类
public class Client {

	public static void main(String[] args) {
		IceCream icecream = new IceCream();
        OreoCookies O = new OreoCookies();
        Almond A = new Almond();
        Cashews C = new Cashews();
        Pecan P = new Pecan();
        ChocolateChip Ch = new ChocolateChip();
        System.out.println("冰激凌价格："+icecream.Money()+"元");            
        System.out.println("购买的冰淇淋组合：");
        O.Decorate(icecream);
        A.Decorate(O);
        C.Decorate(A);
        P.Decorate(C);
        Ch.Decorate(P);
        Ch.BaseIce();
        System.out.println("商品价格：" + Ch.Money() + "元");
	}
}
