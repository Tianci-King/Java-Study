package cn.edu.zjut.cs;

import cn.edu.zjut.J_Shape;

/**
 * @author tiancy
 */
public class J_Area {
    public static void main(String[] args) {
        J_Shape[] shapes = new J_Shape[3];
        shapes[0] = new J_Rectange(2,2);
        shapes[1] = new J_Circle(3);
        shapes[2] = new J_Triangle(3,4,5);
        for (J_Shape shape : shapes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
