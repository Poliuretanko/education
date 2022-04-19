package com.education.patterns.bridge;

import java.util.List;

public class Point {
    private final List<Double> values;

    public Point(List<Double> values) {
        this.values = values;
    }

    public List<Double> getValues() {
        return values;
    }

    public String draw(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append("Point ").append(name).append(" [ ");
        getValues().forEach(value -> builder.append(value).append(" "));
        builder.append("]");
        return builder.toString();
    }
}
