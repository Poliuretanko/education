package com.education.patterns.bridge;

public class Quadrangle implements Shape {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final Point pointD;
    private final Dimention dimention;

    public Quadrangle(Point pointA, Point pointB, Point pointC, Point pointD, Dimention dimention) {
        this.dimention = dimention;
        this.pointA = getDimention().getPoint(pointA);
        this.pointB = getDimention().getPoint(pointB);
        this.pointC = getDimention().getPoint(pointC);
        this.pointD = getDimention().getPoint(pointD);
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public Dimention getDimention() {
        return dimention;
    }

    @Override
    public String draw() {
        return "Triangle [ " + getPointA().draw("A") + ", " + getPointB().draw("B") + ", "
                + getPointC().draw("C") + ", " + getPointD().draw("D") + " ]";
    }
}
