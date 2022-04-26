package com.education.patterns.bridge;

import java.util.ArrayList;

public class Dimention2 implements Dimention{
    @Override
    public Point getPoint(Point initialPoint) {
        Double xValue = initialPoint.getValues().get(0);
        Double yValue = initialPoint.getValues().get(1);
        ArrayList<Double> values = new ArrayList<>();
        values.add(xValue);
        values.add(yValue);
        return new Point(values);
    }
}
