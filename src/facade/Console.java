package facade;

public class Console {
    private Equipment camera = new Camera();
    private Equipment light = new Light();
    private Equipment sensor = new Sensor();
    private Equipment alarm = new Alarm();

    public void turnOnAll() {
        camera.turnOn();
        light.turnOn();
        sensor.turnOn();
        alarm.turnOn();
    }

    public void turnOffAll() {
        camera.turnOff();
        light.turnOff();
        sensor.turnOff();
        alarm.turnOff();
    }
}