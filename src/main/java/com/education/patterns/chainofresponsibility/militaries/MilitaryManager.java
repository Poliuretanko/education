package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Order;
import com.education.patterns.chainofresponsibility.Position;

import java.util.ArrayList;
import java.util.Collection;

public abstract class MilitaryManager extends Military {

    Collection<Military> subordinates = new ArrayList<>();

    public MilitaryManager(Position position, String name) {
        super(position, name);
    }

    Collection<Military> getSubordinates() {
        return subordinates;
    }

    @Override
    public String executeAnOrder(Order order, Position position) {
        StringBuilder builder = new StringBuilder();
        getSubordinates().forEach( subordinate -> {
            String state = subordinate.executeAnOrder(order, position);
            builder.append(state).append("\n");
        });
        return builder.append(super.executeAnOrder(order, position)).append("\n").toString();
    }

    @Override
    public String getState() {
        StringBuilder builder = new StringBuilder();
        getSubordinates().forEach( subordinate -> builder.append(subordinate.getState()).append("\n"));
        return builder.append(super.getState()).toString();
    }
}
