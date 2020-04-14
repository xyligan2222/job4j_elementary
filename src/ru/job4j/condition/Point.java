package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Расстояние между точками в двухмерном пространстве
 * Расстояние между точками в трехмерном пространстве
 * @author Shirokov Andrey
 */
public class Point {

    private int x;
    private int y;
    private int z;


    public Point(int first, int second) {
        this.x = first;
        this.y = second;

    }
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info3d() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 3, 4);

        double dist = a.distance(b);
        double dist3 = a.distance3d(b);
        System.out.println(dist);
        System.out.println(dist3);
    }
}