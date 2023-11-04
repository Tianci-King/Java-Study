package cn.edu.zjut.cs;

/**
 * @author tiancy
 */
public class J_Rectange extends cn.edu.zjut.J_Shape{
    private final double width;
    private final double height;

    public J_Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
