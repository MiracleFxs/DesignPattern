package observer;

public class Client {
	public static void main(String[] args){
		MessageSubject messageSubject1 = new MessageSubject("联想笔记本", "降价");
		MessageSubject messageSubject2 = new MessageSubject("懒人沙发", "未降价");
		
		messageSubject1.increase(new MessageObserver(messageSubject1));
		messageSubject2.increase(new MessageObserver(messageSubject2));
		System.out.println("尊贵的会员,您之前加入购物车的商品：");
		messageSubject1.notifyVIP();
		System.out.println("尊贵的会员,您之前加入购物车的商品：");
		messageSubject2.notifyVIP();
		
	}
}

