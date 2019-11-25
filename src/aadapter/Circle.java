package aadapter;
//下面分别是画圆、矩形、线条类
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}