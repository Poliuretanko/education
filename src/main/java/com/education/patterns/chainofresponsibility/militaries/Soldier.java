package com.education.patterns.chainofresponsibility.militaries;

import com.education.patterns.chainofresponsibility.Position;

public class Soldier extends Military {

    public Soldier(Position position, String name) {
        super(position, name);
    }

    @Override
    String getName() {
        return "   Soldier " + name;
    }
}
