package facade;

public class Alarm implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("打开警报器");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭警报器");
    }
}