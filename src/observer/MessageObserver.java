package observer;

public class MessageObserver extends Observer {
	private String name;
	private String price;
	private MessageSubject messageSubject;
	
	public MessageObserver(MessageSubject messageSubject) {
		this.messageSubject = messageSubject;
	}
	
	@Override
	public void update() {
		name = messageSubject.getName();
		price = messageSubject.getPrice();
		System.out.println("名称变化："+name);
		System.out.println("价格变化："+price);
	}
}
