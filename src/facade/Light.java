package facade;

public class Light implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("打开电灯");
    }
    @Override
    public void turnOff() {
        System.out.println("关闭电灯");
    }
}