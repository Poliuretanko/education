package com.education.patterns.bridge;

import java.util.ArrayList;

public class Dimention1 implements Dimention{
    @Override
    public Point getPoint(Point initialPoint) {
        Double xValue = initialPoint.getValues().get(0);
        ArrayList<Double> values = new ArrayList<>();
        values.add(xValue);
        return new Point(values);
    }
}
