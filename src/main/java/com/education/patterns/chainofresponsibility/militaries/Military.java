package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Order;
import com.education.patterns.chainofresponsibility.Position;

public abstract class Military {

    protected Position position;
    protected Order activeOrder = Order.stay;
    protected String name;

    public Military(Position position, String name) {
        this.position = position;
        this.name = name;
    }

    public String executeAnOrder(Order order, Position position) {
        if (getPosition().equals(position)) {
            activeOrder = order;
        }
        return getName() + " " + getPosition().getDescription() + " " + getActiveOrder().getDescription();
    }

    public String getState() {
        return getName() + " " + getPosition().getDescription() + " " + getActiveOrder().getDescription();
    }

    public Position getPosition() {
        return position;
    }

    public Order getActiveOrder() {
        return activeOrder;
    }

    abstract String getName();
}
