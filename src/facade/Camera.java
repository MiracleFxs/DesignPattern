package facade;

public class Camera implements Equipment {
    @Override
    public void turnOn() {
        System.out.println("打开录像机");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭录像机");
    }

}
