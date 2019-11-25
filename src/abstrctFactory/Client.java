package abstrctFactory;
//测试类
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fc1=new MHfactory();
		Hamburg h1=fc1.CreateHambury();
		h1.Show();
		
		Factory fc2=new KFCfactory();
		Cola c1=fc2.CreateCola();
		c1.Show();
	}

}
