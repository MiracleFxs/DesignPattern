package bridge;

public class SmallCoffee implements Coffee {
	private Additives additives;
    @Override
    public void add(Additives additives) {
        this.additives=additives;
    }
    @Override
    public void drink() {
        additives.add();
        System.out.println("的小咖啡");
    }

}
