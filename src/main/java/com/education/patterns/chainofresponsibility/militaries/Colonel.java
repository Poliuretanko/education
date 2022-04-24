package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Order;
import com.education.patterns.chainofresponsibility.Position;

import java.util.Collection;

public class Colonel extends MilitaryManager {

    public Colonel(Position position, String name, Collection<Commander> subordinates) {
        super(position, name);
        this.subordinates.addAll(subordinates);
    }

    @Override
    String getName() {
        return " Colonel " + name;
    }
}
