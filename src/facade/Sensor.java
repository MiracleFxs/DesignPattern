package facade;
public class Sensor implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("打开传感器");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭传感器");
    }
}