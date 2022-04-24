package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Position;

import java.util.Collection;

public class Admiral extends MilitaryManager {

    public Admiral(Position position, String name, Collection<Colonel> subordinates) {
        super(position, name);
        this.subordinates.addAll(subordinates);
    }

    @Override
    String getName() {
        return "Admiral " + name;
    }
}
