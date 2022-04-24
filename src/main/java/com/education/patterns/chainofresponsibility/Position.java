package com.education.patterns.chainofresponsibility;

public enum Position {
    base("on the base"),
    rear("on the rear"),
    front("on the front"),
    leftFlank("on the left flank"),
    rightFlank("on the right flank");

    private final String description;

    Position(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
