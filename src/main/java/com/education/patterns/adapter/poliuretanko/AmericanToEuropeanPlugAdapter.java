package com.education.patterns.adapter.poliuretanko;

public class AmericanToEuropeanPlugAdapter extends EuropeanPlug {
    private final AmericanPlug plug;

    public AmericanToEuropeanPlugAdapter(AmericanPlug plug) {
        this.plug = plug;
    }

    @Override
    public String getName() {
        return plug.getName();
    }
}
