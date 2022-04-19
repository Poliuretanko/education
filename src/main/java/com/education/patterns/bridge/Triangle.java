package com.education.patterns.bridge;

public class Triangle implements Shape {
    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final Dimention dimention;

    public Triangle(Point pointA, Point pointB, Point pointC, Dimention dimention) {
        this.dimention = dimention;
        this.pointA = getDimention().getPoint(pointA);
        this.pointB = getDimention().getPoint(pointB);
        this.pointC = getDimention().getPoint(pointC);
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

    public Dimention getDimention() {
        return dimention;
    }

    @Override
    public String draw() {
        return "Triangle [ " + getPointA().draw("A") + ", " + getPointB().draw("B") + ", " +
                getPointC().draw("C") + " ]";
    }
}
