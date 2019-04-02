package Exam;

import java.util.ArrayList;

public class sumArea {
    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        GeometricObject[] array = {new Circle(1), new Rectangle(10,20)};
        sumArea(array);
        System.out.println("Total area of elements in array: " + sumArea(array));}
}
