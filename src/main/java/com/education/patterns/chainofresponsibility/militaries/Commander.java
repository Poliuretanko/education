package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Position;

import java.util.Collection;

public class Commander extends MilitaryManager {

    public Commander(Position position, String name, Collection<Soldier> subordinates) {
        super(position, name);
        this.subordinates.addAll(subordinates);
    }

    @Override
    String getName() {
        return "  Commander " + name;
    }
}
