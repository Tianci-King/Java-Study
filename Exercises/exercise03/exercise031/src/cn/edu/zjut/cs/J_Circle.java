package cn.edu.zjut.cs;

/**
 * @author tiancy
 * 圆形J_Circle类(package为cn.edu.zjut.cs)继承J_Shape抽象类，该类包含成员域radius
 */
public class J_Circle extends cn.edu.zjut.J_Shape{
    private final double radius;

    public J_Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
