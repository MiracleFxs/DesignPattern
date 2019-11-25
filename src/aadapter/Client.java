package aadapter;
//客户端测试类
public class Client {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape l = new Line();
        Shape a = new AngleAdapter();

        c.draw();
        r.draw();
        l.draw();
        a.draw(); // 适配器将接口统一了
    }
}
