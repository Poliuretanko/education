package com.education.patterns.bridge;

import java.util.ArrayList;

public class Dimention3 implements Dimention{
    @Override
    public Point getPoint(Point initialPoint) {
        Double xValue = initialPoint.getValues().get(0);
        Double yValue = initialPoint.getValues().get(1);
        Double zValue = initialPoint.getValues().get(2);
        ArrayList<Double> values = new ArrayList<>();
        values.add(xValue);
        values.add(yValue);
        values.add(zValue);
        return new Point(values);
    }
}
