package com.education.patterns.adapter.poliuretanko;

public class AmericanPowerSocket implements PowerInterface {

    private AmericanPlug plug;

    @Override
    public void connect(Plug plug) {
        if (!(plug instanceof AmericanPlug)) {
            System.out.println("The plug " + plug.getName() + " cannot be connected with " + this.getName());
            return;
        }
        System.out.println("The plug " + plug.getName() + " connected with " + this.getName());
        this.plug = (AmericanPlug) plug;
    }

    @Override
    public void disconnect() {
        System.out.println("The plug " + plug.getName() + " disconnected from " + this.getName());
        this.plug = null;
    }

    @Override
    public String getName() {
        return "American Power Socket";
    }
}
