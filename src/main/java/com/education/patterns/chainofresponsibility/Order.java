package com.education.patterns.chainofresponsibility;

public enum Order {
    stay("is staying"),
    retreat("is retreating"),
    attack("is attacking");

    private final String description;

    Order(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
