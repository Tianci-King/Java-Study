package cn.edu.zjut.cs;

import static java.lang.Math.sqrt;

/**
 * @author tiancy
 */
public class J_Triangle extends cn.edu.zjut.J_Shape{
    private final double a,b, c;

    public J_Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a+b<=c || a+c<=b || b+c<=a) {
            throw new IllegalArgumentException("Illegal side length");
        }
    }

    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
