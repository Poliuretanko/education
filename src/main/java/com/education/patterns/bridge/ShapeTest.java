package com.education.patterns.bridge;

import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {
        Point qPointA = new Point(Arrays.asList(1.0, 1.0, 1.0));
        Point qPointB = new Point(Arrays.asList(3.0, 2.0, 1.0));
        Point qPointC = new Point(Arrays.asList(1.0, 3.0, 2.0));
        Point qPointD = new Point(Arrays.asList(2.0, 1.0, 3.0));
        Dimention dimention1 = new Dimention1();
        Dimention dimention2 = new Dimention2();
        Dimention dimention3 = new Dimention3();
        Quadrangle quadrangle1D = new Quadrangle(qPointA, qPointB, qPointC, qPointD, dimention1);
        Quadrangle quadrangle2D = new Quadrangle(qPointA, qPointB, qPointC, qPointD, dimention2);
        Quadrangle quadrangle3D = new Quadrangle(qPointA, qPointB, qPointC, qPointD, dimention3);

        Point tPointA = new Point(Arrays.asList(1.0, 1.0, 1.0));
        Point tPointB = new Point(Arrays.asList(3.0, 2.0, 1.0));
        Point tPointC = new Point(Arrays.asList(1.0, 3.0, 2.0));
        Triangle triangle1D = new Triangle(tPointA, tPointB, tPointC, dimention1);
        Triangle triangle2D = new Triangle(tPointA, tPointB, tPointC, dimention2);
        Triangle triangle3D = new Triangle(tPointA, tPointB, tPointC, dimention3);

        System.out.println(quadrangle1D.draw());
        System.out.println(quadrangle2D.draw());
        System.out.println(quadrangle3D.draw());

        System.out.println(triangle1D.draw());
        System.out.println(triangle2D.draw());
        System.out.println(triangle3D.draw());
    }
}
