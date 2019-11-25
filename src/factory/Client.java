package factory;
//测试类
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbFactory fc1=new HPFactory();
		AbFactory fc2=new AcerFactory();
		AbFactory fc3=new LenovoFactory();
		Laptop hp=fc1.CreateLp();
		Laptop acer=fc2.CreateLp();
		Laptop lenovo=fc3.CreateLp();
		hp.Show();
		acer.Show();
		lenovo.Show();
	}

}
